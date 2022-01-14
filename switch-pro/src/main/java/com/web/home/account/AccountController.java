package com.web.home.account;

import javax.servlet.http.*;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.web.home.account.model.*;
import com.web.home.account.service.*;

@Controller
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private SignService service;
	 
	
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
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(LoginVO dto, HttpSession session, Model model) {
		
		LoginVO data = service.login(dto);
		logger.info("controller 동작");
		
		if(data != null) {
			session.setAttribute("logined", true);
			
			return "redirect: /main";
		} else {
			model.addAttribute("error", true);
			model.addAttribute("error_msg", "일치 안함");
		}
		
		return "/jsp/account/login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request) {
		session = request.getSession();
		System.out.println(request.getSession());
		session.invalidate(); // 세션에 저장된 내용 삭제
		return "redirect: /main";
	}
}
