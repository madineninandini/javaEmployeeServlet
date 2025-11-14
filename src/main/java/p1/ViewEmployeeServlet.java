package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewEmployeeServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			ArrayList<EmployeeBean>a1=new ViewEmployeeDAO().retrieve(); /* here we create for viewempDAO and use retrieve() 
			                                                              these retrieved values are stored into the arraylist*/
			if(a1.size()==0) {
			pw.println("No Employee Details Available");
			}else {
			a1.forEach((k)->{
			EmployeeBean eb=(EmployeeBean)k;
			pw.println(eb.getId()+"&nbsp&nbsp"+
			eb.getName()+"&nbsp&nbsp"+
			eb.getDesg()+"&nbsp&nbsp"+
			eb.getbSal()+"&nbsp&nbsp"+
			eb.getTotSal()+"<br>");
			});
			}
			}

}
