package approach1.services;

import approach1.infrastructure.Repository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    @Autowired
    private Repository1 repository1;

    public void somethingUseful(){
        repository1.remove(123);
    }
}
