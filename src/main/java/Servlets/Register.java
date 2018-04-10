package Servlets;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import dbService.DatabaseService;
import Model.Application;
import Repository.*;

@WebServlet("/register")
public class Register extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private DatabaseService databaseService = new DatabaseService();

    public Register(){
       // databaseService = new DatabaseService();
    }



    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {



        HttpSession session = request.getSession();

        Application application = retrieveApplicationFromRequest(request);
        ApplicationRepository repository= new DummyApplicationRepository();

        session.setAttribute("conf", application);

        repository.add(application);

        response.sendRedirect("succes.jsp");

        databaseService.add(application);
            }

    private Application retrieveApplicationFromRequest (HttpServletRequest request){

        Application result = new Application();
        result.setPassword(request.getParameter("password"));

        result.setEmail(request.getParameter("email"));
        result.setRole("normal");

        return result;


    }

}
