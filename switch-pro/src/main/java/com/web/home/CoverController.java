package com.web.home;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class CoverController {

	private static final Logger logger = LoggerFactory.getLogger(CoverController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String cover() {
		
		logger.info("cover 요청 성공");
		return "./cover";
	}
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String main() {
		logger.info("main 페이지 정상 작동");
		return "/jsp/main/main";
	}
	
	
}
