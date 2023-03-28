package Springbootdomain.Domain.service;

import Springbootdomain.Domain.domain.Member;
import Springbootdomain.Domain.repository.MemberRepository;
import Springbootdomain.Domain.repository.MemoryMemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /** 회원가입 **/
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }
}
