package p1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/add")

public class AddEmployeeServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			EmployeeBean eb=new EmployeeBean(); // create object for bean class
			eb.setId(req.getParameter("id"));  // get data from browser and stored into the bean object 
			eb.setName(req.getParameter("name"));
			eb.setDesg(req.getParameter("desg"));
			int bSal=Integer.parseInt(req.getParameter("bsal"));
			eb.setbSal(bSal);
			float totSal=bSal+(0.93F*bSal); 
			eb.setTotSal(totSal);
			int k=new InsertEmployeeDAO().insert(eb); // we create object for insertdao and insert ob into that and return value into k.
			if(k>0) {
			pw.println("Employee Addedd Successfully");
			RequestDispatcher rd=
			req.getRequestDispatcher("choice.html"); //the result is attached to browser.
			rd.include(req, res);
			}
			}

}
