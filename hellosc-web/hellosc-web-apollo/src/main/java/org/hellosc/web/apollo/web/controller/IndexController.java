package org.hellosc.web.apollo.web.controller;

import java.io.IOException;

import org.hellosc.web.apollo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@ApiOperation(value="应用首页", notes="测试restful")
	@RequestMapping("/index")
    public String index() throws IOException{
        return indexService.index();
    }

}
