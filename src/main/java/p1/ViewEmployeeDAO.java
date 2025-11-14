package p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmployeeDAO {
	public ArrayList<EmployeeBean>al=new ArrayList<EmployeeBean>();
	public ArrayList<EmployeeBean> retrieve(){
	try{
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement
	("select *from Employee52");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
	EmployeeBean eb=new EmployeeBean();
	eb.setId(rs.getString(1));
	eb.setName(rs.getString(2));
	eb.setDesg(rs.getString(3));
	eb.setbSal(rs.getInt(4));
	eb.setTotSal(rs.getFloat(5));
	al.add(eb);
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return al;
	}

}
