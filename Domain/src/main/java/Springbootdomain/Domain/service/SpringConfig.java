package Springbootdomain.Domain.service;

import Springbootdomain.Domain.controller.MemberController;
import Springbootdomain.Domain.repository.MemberRepository;
import Springbootdomain.Domain.repository.MemoryMemberRepository;
import Springbootdomain.Domain.service.MemberService;
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
