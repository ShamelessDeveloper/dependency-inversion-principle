package beforedip.services;

import beforedip.infrastructure.Repository1Impl;

public class Service1 {
    //Service has a direct dependency on the repository implementation. C'est la pire architecture.
    private Repository1Impl repository1;

    public Service1() {
        this.repository1 = new Repository1Impl();
    }

    public void somethingUseful() {
        repository1.remove(123);
    }
}
