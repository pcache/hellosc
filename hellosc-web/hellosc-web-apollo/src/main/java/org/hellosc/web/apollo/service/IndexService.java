package org.hellosc.web.apollo.service;

import java.io.IOException;

import org.hellosc.api.member.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private IMemberService memberService;

	public String index() throws IOException {
		return memberService.getMemberList();
	}
}

