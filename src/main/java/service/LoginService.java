package service;

import dbService.DatabaseService;

public class LoginService {

    private DatabaseService databaseService;

    public LoginService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public String getRoleByEmail(String email){
       return databaseService.getRoleByEmail(email);
    }
}
