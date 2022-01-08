package com.web.home;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class CoverController {

	private static final Logger logger = LoggerFactory.getLogger(CoverController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String cover() {
		
		logger.info("다시 나옴");
		return "./cover";
	}
}
