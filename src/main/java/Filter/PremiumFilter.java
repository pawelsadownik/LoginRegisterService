package Filter;


import dbService.DatabaseService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/login")
public class PremiumFilter implements Filter{

    private DatabaseService databaseService;

    public PremiumFilter(){
        databaseService = new DatabaseService();
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        if (request.getParameter("Premium") != null){
            String presentUserEmail  =  request.getParameter("email");
            HttpServletResponse httpResponse = (HttpServletResponse) response;

            if (databaseService.getRoleByEmail(presentUserEmail).equals("Premium")){
                httpResponse.sendRedirect("premium.jsp");
            } else {
                httpResponse.sendRedirect("premium-noaccess.jsp");
            }
        }


        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
