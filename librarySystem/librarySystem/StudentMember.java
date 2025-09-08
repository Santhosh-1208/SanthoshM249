package librarySystem;
import java.util.Scanner;
public class StudentMember  {
	public int regNo;
	private String name;
	public String dept;
	public int sem;
	Scanner input=new Scanner(System.in);
	Book borrow[]=new Book[5];
	public static int count;
	public StudentMember(int regNo,String name,int sem,String dept) {
		this.name=name;
		this.regNo=regNo;
		this.sem=sem;
		this.dept=dept;
	}
	public StudentMember() {
		System.out.println("Enter Register No:");
		this.regNo=input.nextInt();
		input.nextLine();
		System.out.println("Enter Name:");
		this.name=input.nextLine();
		System.out.println("Enter Semester:");
		this.sem=input.nextInt();input.nextLine();
		System.out.println("Enter Department:");
		this.dept=input.nextLine();
	}
	public String getName() { 
		return this.name;
	} 
	public int getRegNo() { 
		return this.regNo;
	} 
	public void setName(String name) { 
		this.name=name;
	} 
	public void setSem(int regNo) { 
		this.regNo=regNo;
	} 
	public void studentInfo() { 
	System.out.println("Register No: " + this.regNo + " Name: " + this.name +" Semester:"+this.sem+" Department:"+this.dept); 
	}
}
