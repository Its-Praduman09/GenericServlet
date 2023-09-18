import java.io.*;
import javax.servlet.*;
                       //Servlet(interface) //abstract //init(),service(),destroy(),getServletConfig,getServletInfo()
                             //------> implement---GenericServlet---- define init(),destroy(),getServeletconfig,getServletInfo()-------abstract service()
public class RamaaServlet extends GenericServlet
{
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
	   //web server---web browser
	   response.setContentType("text/html");

	    //diagram  (Buffer)
	   PrintWriter outr=response.getWriter();

	   //write data on servlet object(res)
	   outr.println("<h1> Ramaasoft Generic servlet is working<h1>");

	}

}