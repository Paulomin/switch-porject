package com.web.home.account;

import org.slf4j.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.web.home.account.model.*;

@Controller
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	 
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		logger.info("login 페이지 요청 성공");
		return "/jsp/account/login";
	}
	
	@RequestMapping(value="/sign", method=RequestMethod.GET)
	public String sign() {
		logger.info("sign 페이지 요청 성공");
		return "/jsp/account/sign";
	}
	
	@RequestMapping(value="/sign", method=RequestMethod.POST)
	public String sign(SignVO vo, Model model) {
		return "/jsp/account/sign";
	}
}
