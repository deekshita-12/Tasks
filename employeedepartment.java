package employee;
import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	String ename;
	long enumber;
	 void EmInfo()
	 {
		 System.out.println("Enter the name and number of the employee");
		 ename=sc.nextLine();
		 enumber=sc.nextLong();
	 }
	 void EmDisplay()
	 {
		 System.out.println("Employee Name :"+ename+"\nEmployee Number :"+enumber);
	 }
}
public class Department extends Employee
{
	String depname;
	long depnumber;
	void DepInfo()
	{
		System.out.println("Enter the name and number of the department");
		depname=sc.next();
		depnumber=sc.nextLong();
	}
	void DepDisplay()
	{
		System.out.println("Department Name :"+depname+"\nDepartment Number :"+depnumber);
	}
	public static void main(String args[])
	{
		Department d=new Department();
		d.EmInfo();
		d.DepInfo();
		d.DepDisplay();
		d.EmDisplay();
	}
}
