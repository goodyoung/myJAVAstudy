package Hello.hellospring.service;

import Hello.hellospring.domain.Member;
import Hello.hellospring.repository.MemberRepository;
import Hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional // test 실행 하면 transaction을 걸고 db에 쿼리 다 날리고 그 후에 테스트 끝나면 role back을 해준다(아예 반영을 안해준다) // 다음 테스트를 반복해서 쓸 수 있게된다
class MemberServiceIntegrationTest {
    @Autowired MemberService membersService;
    @Autowired MemberRepository memberRepository;
    @Test
    @Commit
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("spring");
        //when
        Long saveId = membersService.join(member);
        //then
        Member findMember = membersService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }
    @Test
    public void 중복_회원_예외(){
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        membersService.join(member1);

        IllegalStateException e = assertThrows(IllegalStateException.class, () -> membersService.join(member2));// join을 실행할 건데, 예외가 터져야 된다
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}