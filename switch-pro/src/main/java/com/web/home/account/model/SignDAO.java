package com.web.home.account.model;

import org.apache.ibatis.session.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.web.home.account.service.*;

@Repository
public class SignDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(SignService.class);
	
	@Autowired
	private SqlSession sess;
	
	public int insertAccount(SignDTO dto) {
		return this.sess.insert("AccountMap.insertAcc", dto);
	}
	
	public LoginVO selectLogin(LoginVO dto) {
		LoginVO data = this.sess.selectOne("AccountMap.oscLogin", dto);
		logger.info("dao 동작");
		return data;
	}
}
