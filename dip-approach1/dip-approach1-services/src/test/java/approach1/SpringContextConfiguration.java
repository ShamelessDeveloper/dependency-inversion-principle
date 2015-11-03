package approach1;

import approach1.infrastructure.Repository1Impl;
import approach1.services.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextConfiguration {
    @Bean
    public Service1 service1(){
        return new Service1();
    }

    @Bean
    public Repository1Impl repository1() {
        return new Repository1Impl();
    }
}
