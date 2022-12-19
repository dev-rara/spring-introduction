package com.rara.springintroduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    //내장하고 있는 Tomcat (웹서버)를 띄우면서 SpringBoot 가 같이 로딩된다.
public class SpringIntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroductionApplication.class, args);
	}

}
