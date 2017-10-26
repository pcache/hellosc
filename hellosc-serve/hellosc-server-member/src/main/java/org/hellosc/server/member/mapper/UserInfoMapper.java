package org.hellosc.server.member.mapper;

import java.util.List;

import org.hellosc.server.member.entity.User;
import org.mybatis.spring.annotation.MapperScan;


@MapperScan
public interface UserInfoMapper {

	public List<User> getUserList();
}
