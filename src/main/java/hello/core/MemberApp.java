package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memebr = new Member(1L, "memebrA", Grade.VIP);
        memberService.join(memebr);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + memebr.getName());
        System.out.println("find Member " + findMember.getName());


    }
}