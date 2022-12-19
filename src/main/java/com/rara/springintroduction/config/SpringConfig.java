package com.rara.springintroduction.config;

import com.rara.springintroduction.repository.MemberRepository;
import com.rara.springintroduction.repository.MemoryMemberRepository;
import com.rara.springintroduction.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
	}

	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}
