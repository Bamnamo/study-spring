package spring.study.kim.hellospringpsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.study.kim.hellospringpsb.aop.TimeTraceAop;
import spring.study.kim.hellospringpsb.repository.JpaMemberRepository;
import spring.study.kim.hellospringpsb.repository.MemberRepository;
import spring.study.kim.hellospringpsb.service.MemberService;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
/*
    @Bean
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }

 */

    //  @Bean
    //public JpaMemberRepository memoryMemberRepository() {
    //return new JdbcMemberRepository(dataSource);
    //return new JdbcTemplateMemberRepository(dataSource);
    //return new JpaMemberRepository(em);

}

