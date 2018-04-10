package Filter;

import dbService.DatabaseService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter ("/login")
public class AdminFilter implements Filter {

    private DatabaseService databaseService;

    public AdminFilter() {
        databaseService = new DatabaseService();

    }
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        HttpSession session = httpRequest.getSession();

        String admin = "admin";


        if (request.getParameter("email").equals(admin)) {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.sendRedirect("admin.jsp");

        }

    /*        else {
                response.getWriter().println("Twoj email");
                response.getWriter().println(request.getParameter("email"));

                response.getWriter().println("Twoje haslo");
                response.getWriter().println(request.getParameter("password"));

                response.getWriter().println("Twoje uprawnienia");
                response.getWriter().println(databaseService.getRoleByEmail(request.getParameter("email")));

                return;



        }*/
        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
