package com.web.home.account.model;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Repository
public class SignDAO {
	
	@Autowired
	private SqlSession sess;
	
	public int insertAccount(SignVO vo) {
		return this.sess.insert("AccountMapper.insertAccount", vo);
	}
	
	
	
}
