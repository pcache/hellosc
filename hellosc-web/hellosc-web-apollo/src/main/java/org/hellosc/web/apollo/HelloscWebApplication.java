package org.hellosc.web.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * 容器初始化类
 * @author lx
 *
 */
@SpringBootApplication
@ImportResource("classpath:dubbo/consumer.xml")
public class HelloscWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloscWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloscWebApplication.class, args);
	}
}
