package spring.study.kim.hellospringpsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.study.kim.hellospringpsb.repository.JdbcMemberRepository;
import spring.study.kim.hellospringpsb.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memoryMemberRepository());
    }

    @Bean
    public JdbcMemberRepository memoryMemberRepository() {
        return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
    }
}
