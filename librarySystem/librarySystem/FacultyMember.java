package librarySystem;
import java.util.Scanner;
public class FacultyMember {
	public int memberId;
	private String name;
	private String designation;
	private String priority;
	Scanner input=new Scanner(System.in);
	Book borrow[]=new Book[5];
	public static int count;
	public FacultyMember(int memberId,String name,String designation,String priority) {
		this.memberId=memberId;
		this.name=name;
		this.designation=designation;
		this.priority=priority;
	}
	public FacultyMember() {
		System.out.println("Enter MemberId:");
		this.memberId=input.nextInt();
		input.nextLine();
		System.out.println("Enter Name:");
		this.name=input.nextLine();
		System.out.println("Enter Designation:");
		this.designation=input.nextLine();
		System.out.println("Enter Priority:");
		this.priority=input.nextLine();
	}
	public String getDesignation() { 
		return this.designation;
	} 
	public String getPriority() { 
		return this.priority;
	} 
	public void setDept(String designation) { 
		this.designation=designation;
	} 
	public void setSem(String priority) { 
		this.priority=priority;
	} 
	public void facultyInfo() { 
	System.out.println("MemberId: " + this.memberId + " Name: " +this.name+" Designation: " + this.designation + " Priority: " + this.priority ); 
	}
}
