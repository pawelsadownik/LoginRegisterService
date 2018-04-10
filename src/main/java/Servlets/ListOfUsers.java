package Servlets;


import Model.Application;
import dbService.DatabaseService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/list")
public class ListOfUsers extends HttpServlet {

    private DatabaseService databaseService;

    public ListOfUsers() {
        databaseService = new DatabaseService();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Application> users = new ArrayList<Application>();

        users = databaseService.getAll();

        response.setContentType("text/html");
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<h1>USERS:</h1>");
        stringBuilder.append("<table border='1' cellpadding='10'>");

        stringBuilder.append("<b>");
        stringBuilder.append("<td>");
        stringBuilder.append("USER ID");
        stringBuilder.append("</td>");
        stringBuilder.append("</b>");

        stringBuilder.append("<b>");
        stringBuilder.append("<td>");
        stringBuilder.append("EMAIL");
        stringBuilder.append("</td>");
        stringBuilder.append("</b>");

        stringBuilder.append("<b>");
        stringBuilder.append("<td>");
        stringBuilder.append("ROLE");
        stringBuilder.append("</td>");
        stringBuilder.append("</b>");


        for (Application user : users) {
            stringBuilder.append("<tr>");

            stringBuilder.append("<b>");
            stringBuilder.append("<td>");
            stringBuilder.append(user.getId());
            stringBuilder.append("</td>");
            stringBuilder.append("</b>");


            stringBuilder.append("<b>");
            stringBuilder.append("<td>");
            stringBuilder.append(user.getEmail());
            stringBuilder.append("</td>");
            stringBuilder.append("</b>");

            stringBuilder.append("<b>");
            stringBuilder.append("<td>");
            stringBuilder.append(user.getRole());
            stringBuilder.append("</td>");
            stringBuilder.append("</b>");


            stringBuilder.append("</tr>");

        }

        response.getWriter().println(stringBuilder.toString());

    }
}
