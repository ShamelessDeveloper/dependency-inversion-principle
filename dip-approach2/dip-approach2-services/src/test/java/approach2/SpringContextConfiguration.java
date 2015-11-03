package approach2;

import approach2.services.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("approach2.infrastructure.impl")
public class SpringContextConfiguration {
    @Bean
    public Service1 service1(){return new Service1();}
}
