package hello.core.member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceImplTest {
  MemberService memberService = new MemberServiceImpl();
  @Test
  void join(){
    Member member = new Member(1L, "memberA", Grade.VIP);

    memberService.join(member);

    Assertions.assertThat(member).isEqualTo(memberService.findMember(1L));
  }
}