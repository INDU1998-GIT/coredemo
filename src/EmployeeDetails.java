import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter employee name");
		String name=s.next();
		System.out.println("enter employee gender");
		String gender=s.next();
		System.out.println("enter employee id");
		int id = s.nextInt();
		System.out.println("enter Basic Salary");
		int basic=s.nextInt();
		System.out.println("enter employee HRA");
		int HRA=s.nextInt();
		System.out.println("Enter employee DA");
		int DA=s.nextInt();
		System.out.println("enter employee pf");
		int PF=s.nextInt();
		int netsalary=basic+HRA+DA-PF;
		System.out.println("Employee Name:" +name);
		System.out.println("Employee gender:" +gender);
		System.out.println("employee id:" +id);
		System.out.println("Employee basic salary:" +basic);
		System.out.println("employee HRA:" +HRA);
		System.out.println("Employee DA:" +DA);
		System.out.println("Employee PF:" +PF);
		System.out.println("Employee Net Salary:" +netsalary);
		
		
		

	}

}
