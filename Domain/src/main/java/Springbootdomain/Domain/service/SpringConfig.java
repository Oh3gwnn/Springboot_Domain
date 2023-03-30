package Springbootdomain.Domain.service;

import Springbootdomain.Domain.repository.JdbcMemberRepository;
import Springbootdomain.Domain.repository.JdbcTemplateMemberRepository;
import Springbootdomain.Domain.repository.JpaMemberRepository;
import Springbootdomain.Domain.repository.MemberRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
//      return new JdbcTemplateMemberRepository(dataSource);
//      return new JdbcMemberRepository(dataSource);
//      return new MemoryMemberRepository();
    }
}
