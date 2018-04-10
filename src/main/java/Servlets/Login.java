package Servlets;


import dbService.DatabaseService;
import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    private LoginService loginService;

    public Login() {
        DatabaseService databaseService = new DatabaseService();
        this.loginService = new LoginService(databaseService);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Twoj email");
        response.getWriter().println(request.getParameter("email"));

        response.getWriter().println("Twoje haslo");
        response.getWriter().println(request.getParameter("password"));

        response.getWriter().println("Twoje uprawnienia");

        String role = loginService.getRoleByEmail(request.getParameter("email"));

        response.getWriter().println(role);

        return;
    }
}
