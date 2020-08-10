package spring.study.kim.hellospringpsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.study.kim.hellospringpsb.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
