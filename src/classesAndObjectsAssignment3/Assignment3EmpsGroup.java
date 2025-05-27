package classesAndObjectsAssignment3;

public class Assignment3EmpsGroup {
	
	
	

	public static void main(String[] args) {
		
		Assignment3Employees emp= new Assignment3Employees();
		
		String[] empname= {emp.empname1,emp.empname2,emp.empname3};
		int []empid = {emp.empid1,emp.empid2,emp.empid3};
		
	        System.out.println("Employee Name: " + empname[0]+ ", EmployeeID: " +empid[0]);
	        System.out.println("Employee Name: " + empname[1] + ", EmployeeID: " +empid[1]);
	        System.out.println("Employee Name: " + empname[2] + ", EmployeeID: " + empid[2]);
		
		

	}

}
 