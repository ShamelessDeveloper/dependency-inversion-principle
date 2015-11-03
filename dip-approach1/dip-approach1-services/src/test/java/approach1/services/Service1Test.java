package approach1.services;

import approach1.SpringContextConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextConfiguration.class)
public class Service1Test {
    @Autowired
    Service1 service1;

    @Test
    public void serviceShouldBeCalledWithoutProblems() {
        service1.somethingUseful();
    }
}
