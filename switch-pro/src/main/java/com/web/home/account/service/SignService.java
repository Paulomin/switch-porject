package com.web.home.account.service;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.web.home.account.model.*;

@Service
public class SignService {
	
	private static final Logger logger = LoggerFactory.getLogger(SignService.class);

	@Autowired
	private SignDAO dao;
	
	//@Transactional(rollbackFor=Exception.class) // Exception이 나오면 rollback 하겠다는 뜻 throws Exception
	public boolean join(SignDTO vo) {
		int result = dao.insertAccount(vo);
		
		if(result == 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public LoginVO login(LoginVO dto) {
		LoginVO data = dao.selectLogin(dto);
		logger.info("service 동작");
		data.setPassword("");
		return data;
	}

}
