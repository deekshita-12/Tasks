package marks;
import java.util.*;
class Student
{
	Scanner sc=new Scanner(System.in);
	String sname;
	long snumber;
	void SInfo()
	 {
		 System.out.println("Enter the name and roll no. number of the student");
		 sname=sc.nextLine();
		 snumber=sc.nextLong();
	 }
	 void SDisplay()
	 {
		 System.out.println("Student Name :"+sname+"\nRoll Number :"+snumber);
	 }
}
class Marks extends Student
{
	Scanner sc=new Scanner(System.in);
	double marks1,marks2;
	void MInfo()
	 {
		 System.out.println("Enter the marks in two subjects :");
		 marks1=sc.nextDouble();
		 marks2=sc.nextDouble();
	 }
	 void MDisplay()
	 {
		 System.out.println("Marks in first subject :"+marks1+"\nMarks in second subject :"+marks2);
	 }
}
public class FinalTotal extends Marks 
{
	double ftotal;
	void Total()
	 {
		 ftotal=marks1+marks2;
	 }
	 void TDisplay()
	 {
		 System.out.println("Total Marks :"+ftotal);
	 }
	 public static void main(String args[])
	 {
		 FinalTotal ft=new FinalTotal();
		 ft.SInfo();
		 ft.MInfo();
		 ft.Total();
		 ft.SDisplay();
		 ft.MDisplay();
		 ft.TDisplay();
	 }
}
