import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());
response.setContentType("text/html");
PrintWriter out = response.getWriter();

String value = request.getParameter("website") ;
if(value.equals("google")){
response.sendRedirect("https://www.google.com");
}
else if(value.equals("facebook")){
response.sendRedirect("https://www.facebook.com");
}
else if(value.equals("amazon")){
response.sendRedirect("https://www.amazon.com");
}
else if(value.equals("forbes")){
response.sendRedirect("https://www.forbes.com");
}
else if(value.equals("yahoo")){
response.sendRedirect("https://www.yahoo.com");
}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}






