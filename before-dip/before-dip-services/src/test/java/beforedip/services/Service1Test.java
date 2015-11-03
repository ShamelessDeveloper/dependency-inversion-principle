package beforedip.services;

import org.junit.Test;

public class Service1Test {
    @Test
    public void serviceShouldBeCalledWithoutProblems(){
        Service1 service1 = new Service1();
        service1.somethingUseful();
    }
}
