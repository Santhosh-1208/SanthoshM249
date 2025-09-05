package librarySystem;

public class StudentMember extends Member {
	private int sem;
	private String dept;
	private int borrowLimit;
	public StudentMember(int memberId,String name,String email,long phone,int sem,String dept,int borrowLimit) {
		super(memberId,name,email,phone);
		this.sem=sem;
		this.dept=dept;
		this.borrowLimit=borrowLimit;
	}
	public String getDept() { 
		return this.dept;
	} 
	public int getSem() { 
		return this.sem;
	} 
	public int getBorrowLimit() { 
		return this.borrowLimit;
	} 
	public void setDept(String dept) { 
		this.dept=dept;
	} 
	public void setSem(int sem) { 
		this.sem=sem;
	} 
	public void setBorrowLimit(int borrowLimit) { 
		this.borrowLimit=borrowLimit;
	} 
	public void studentInfo() { 
	super.memberInfo();
	System.out.println("Semester: " + this.sem + " Department: " + this.dept +" BorrowLimit: " + this.borrowLimit ); 
	} 
}
