package employee;
import java.util.*;
class Employee 
{
    int Emp_id;
    String Emp_name;
    int Emp_salary;
    Employee(int empid, String empname, int empsalary) 
    {
        Emp_id = empid;
        Emp_name = empname;
        Emp_salary = empsalary;
    }

    void display() {
        System.out.println("ID: "+this.Emp_id + " Name: "+this.Emp_name + " Salary:" + this.Emp_salary);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID, Name and Salary of Employee:");
        int Emp_id = sc.nextInt();
        String Emp_name = sc.next();
        int Emp_salary = sc.nextInt();
        Employee e = new Employee(Emp_id, Emp_name, Emp_salary);
        System.out.println("Employee Details: \n-------------------");            
        e.display();

    }
}
