package Springbootdomain.Domain.controller;

import Springbootdomain.Domain.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    /** 1. 생성자 주입 **/
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /** 2. 필드 주입 **/
    // @Autowired private MemberService memberService; //

    /** 3. setter 주입 **/
//    @Autowired
//    public setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

}
