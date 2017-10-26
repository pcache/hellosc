package org.hellosc.server.member.service;

import java.util.List;

import org.hellosc.api.member.IMemberService;
import org.hellosc.server.member.entity.User;
import org.hellosc.server.member.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class MemberService implements IMemberService{

	@Autowired
	private UserInfoMapper userMapper;
	
	@Override
	public String getMemberList() {
		List<User> userList = userMapper.getUserList();
		return JSON.toJSONString(userList);
	}

}
