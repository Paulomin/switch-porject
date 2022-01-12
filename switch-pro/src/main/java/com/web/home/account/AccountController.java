package com.web.home.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.*;
import org.mybatis.logging.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.web.home.account.model.*;
import com.web.home.account.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private SignService service;
	private SignDTO dto;
	 
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		logger.info("login 페이지 요청 성공");
		return "/jsp/account/login";
	}
	@RequestMapping(value="/sign", method=RequestMethod.GET)
	public String sign() {
		return "jsp/account/sign";
	}
	
	@RequestMapping(value="/sign", method=RequestMethod.POST)
	public String sign(SignDTO vo, Model model) {
		boolean res = service.join(vo);
		System.out.println(vo.toString());
		
		if(res) {
			return "redirect:/login"; // 결과가 true면 가입이 완료 되어 로그인 창으로 리다이렉트시킴
		} else {
			return "/jsp/account/sign"; // 회원가입 중 문제가 발생하여 가입 실패 
		}
	}
	
	@RequestMapping(value="/main", method=RequestMethod.POST)
	public String login(SignDTO dto) {
		if()
	}
}
