package com.web.home.account;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class InfoController{

	private static final Logger logger = LoggerFactory.getLogger(InfoController.class);
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String info() {
		logger.info("마이페이지 불러오기 성공");
		
		return "/jsp/main/info";
	}
}
