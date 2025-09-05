package librarySystem;

public class Member {
	private int memberId;
	private String name;
	private String email;
	private long phone;
	public Member(int memberId,String name,String email,long phone) {
		this.memberId=memberId;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	public int getMemberId() { 
		return this.memberId;
	} 
	public String getName() { 
		return this.name;
	} 
	public String getEmail() { 
		return this.email;
	} 
	public long getPhone() { 
		return this.phone;
	} 
	public void setMemberId(int memberId) { 
		this.memberId=memberId;
	} 
	public void setName(String name) { 
		this.name=name;
	} 
	public void setEmail(String email) { 
		this.email=email;
	} 
	public void setPhone(long phone) { 
		 this.phone=phone;
	} 
	public void memberInfo() { 
	System.out.println("MemberID: " + this.memberId + " Name: " + this.name +" Email: " + this.email + " Phone: " + this.phone); 
	} 
}
