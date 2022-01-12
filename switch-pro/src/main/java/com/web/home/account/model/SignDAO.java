package com.web.home.account.model;

import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Repository
public class SignDAO {
	
	@Autowired
	private SqlSession sess;
	
	
	public int insertAccount(SignDTO dto) {
		return this.sess.insert("AccountMap.insertAcc", dto);
	}
	
	public boolean selectUser(SignDTO dto) {
		return this.sess.selectOne("", dto);
	}
	
	
	
}
