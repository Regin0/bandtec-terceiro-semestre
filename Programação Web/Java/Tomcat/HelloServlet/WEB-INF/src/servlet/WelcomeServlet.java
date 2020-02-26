package servlet;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class WelcomeServlet extends HttpServlet {
 
@Override
public void init(ServletConfig config) throws ServletException {
super.init(config);
}
 
protected void print( PrintWriter writer, String msg)
{
  writer.println( msg );
}
 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
* Get the value of form parameter
*/
String name = request.getParameter("name");
String welcomeMessage = "Welcome "+name;
/*
* Set the content type(MIME Type) of the response.
*/
response.setContentType("text/html");
 
PrintWriter out = response.getWriter();
/*
* Write the HTML to the response
*/
print( out, "<html>");
print( out, "<head>");
print( out, "<title> A very simple servlet example</title>");
print( out, "</head>");
print( out, "<body>");
print( out, "<h1>"+welcomeMessage+"</h1>");
print( out, "<a href=\"/servlet/\">"+"Click here to go back to input page "+"</a>");
print( out, "</body>");
print( out, "</html>");
out.close();
 
}
 
 
public void destroy() {
 
}

} 