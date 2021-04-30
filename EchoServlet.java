
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String usname="suhas",paswrd="12345";
        String name=request.getParameter("username");
        String secretword=request.getParameter("password");
        Integer a=secretword.length();
        

        if(name.equals(usname)&&secretword.equals(paswrd))
        {
            out.println("<h2>Login Successfull "+name+"</h2>");
            out.println("<h2>Username:</h2><h3>"+name+"</h3>");
            out.println("<h2>Password:</h2><h3>"+secretword+"</h3>");
        }
        else
        {
           out.println("<h2>Login Unsuccessfull "+name+"</h2>");
            out.println("<h2>Username:</h2><h3>"+name+"</h3>");
            out.println("<h2>Password:</h2><h3>"+secretword+"</h3>");
        }
        out.print("<h3>Password Replaced with (***)</h3>");
        for(int i=0;i<a;i++)
        {
            out.print("*");
        }
    }
}
