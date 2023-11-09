package Hello.hellospring.repository;

import Hello.hellospring.domain.Member;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{
    private final EntityManager em;
    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }
    @Override
    public Member save(Member member) { //저장 조회 업데이트는 sql을 짤 필요가 없다. //여러개를 돌려서 jpqa를 작성한다.
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long Id) {
        Member member = em.find(Member.class, Id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class) //entity 대상으로 query를 날린다.
                .getResultList();
    }
}
