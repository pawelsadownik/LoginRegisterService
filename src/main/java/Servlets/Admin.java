package Servlets;


import Model.Application;
import dbService.DatabaseService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin")
public class Admin extends HttpServlet {

    private DatabaseService databaseService;

    public Admin(){
        databaseService = new DatabaseService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

      //  databaseService.update(request.getParameter("role"));
        String email = request.getParameter("email");
        String role = null;
        
        if (request.getParameter("Premium") != null){
            role = "Premium";
        } else if (request.getParameter("Normal") != null){
            role = "Normal";
        }

        databaseService.update(email, role);

        response.sendRedirect("/list");

    }



}