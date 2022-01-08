package com.web.home.account.service;

import org.mybatis.logging.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.web.home.account.model.*;

@Service
public class SignService {
	
	private static final Logger logger = LoggerFactory.getLogger(SignService.class);

	@Autowired
	private SignDAO dao;
	
	@Transactional(rollbackFor=Exception.class) // Exception이 나오면 rollback 하겠다는 뜻
	public boolean join(SignVO vo) throws Exception {
		int result = dao.insertAccount(vo);
		
		if(result == 1) {
			return true;
		} else {
			throw new Exception("회원가입 중 문제가 발생하였습니다.");
		}
		
	}

}
