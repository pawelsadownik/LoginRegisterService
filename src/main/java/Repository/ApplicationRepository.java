package Repository;

import Model.Application;

public interface ApplicationRepository {



        Application getApplicationByEmailAddress (String email);
        void add (Application application);
        int count();


    }

