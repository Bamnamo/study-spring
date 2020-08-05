package spring.study.kim.hellospringpsb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.study.kim.hellospringpsb.repository.MemoryMemberRepository;
import spring.study.kim.hellospringpsb.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memoryMemberRepository());
    }

    @Bean
    public MemoryMemberRepository memoryMemberRepository(){
        return new MemoryMemberRepository();
    }
}
