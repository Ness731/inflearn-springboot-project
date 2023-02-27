package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join() {
        //** 회원가입 기능 테스트 **
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}