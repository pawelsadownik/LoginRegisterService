package Repository;


import Model.Application;

import java.util.ArrayList;
import java.util.List;

public class DummyApplicationRepository implements ApplicationRepository {

    private static List<Application> db = new ArrayList<Application>();


    public Application getApplicationByEmailAddress(String email) {

        for (Application application: db) {

            if (application.getEmail().equalsIgnoreCase(email))

                return application;
        }

        return null;
    }


    public void add(Application application) {
        db.add(application);

    }


    public int count() {
        return db.size();
    }
}

