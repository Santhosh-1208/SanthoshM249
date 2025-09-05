package librarySystem;

public class FacultyMember extends Member {
	private String designation;
	private String priority;
	private int borrowLimit;
	public FacultyMember(int memberId,String name,String email,long phone,String designation,String priority,int borrowLimit) {
		super(memberId,name,email,phone);
		this.designation=designation;
		this.priority=priority;
		this.borrowLimit=borrowLimit;
	}
	public String getDesignation() { 
		return this.designation;
	} 
	public String getPriority() { 
		return this.priority;
	} 
	public int getBorrowLimit() { 
		return this.borrowLimit;
	} 
	public void setDept(String designation) { 
		this.designation=designation;
	} 
	public void setSem(String priority) { 
		this.priority=priority;
	} 
	public void setBorrowLimit(int borrowLimit) { 
		this.borrowLimit=borrowLimit;
	} 
	public void facultyInfo() { 
	super.memberInfo();
	System.out.println("Designation: " + this.designation + " Priority: " + this.priority +" BorrowLimit: " + this.borrowLimit ); 
	} 
}
