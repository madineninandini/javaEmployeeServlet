package corejava;
import java.util.Scanner;
public class EmpMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
	    String ename = sc.nextLine();
	    
	    System.out.print("Enter Designation: ");
	    String edesg = sc.nextLine();
	    
	    Designation db = new Designation();
	    boolean isValid = db.verify(edesg);
	    if(isValid)
	    {
	    	System.out.print("Enter Employee ID: ");
		    int eid = sc.nextInt();
		    System.out.print("Enter bsal: ");
		    int bsal = sc.nextInt();
		    if(bsal >= 12000)
		    {
		    	TotalSalary ob = new TotalSalary();
		    	int totsal = ob.Calculate(bsal);
		    	System.out.println("=== Emp details===");
		    	System.out.println("Employee Name: " + ename);
		    	System.out.println("Employee Desg: " + edesg);
		    	System.out.println("Employee id: " + eid);
		    	System.out.println("Employee bsal: " + bsal);
		    	System.out.println("Total sal: " + totsal);
		     }
	        else {
	        	System.out.println("Invalid salary");
	        }
	    }
	        else {
	        	System.out.println("Invalid designation");
	        }
	}
}
