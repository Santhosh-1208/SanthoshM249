package librarySystem;
import java.util.Scanner;
public class Member {
	Books b1=new Books();
	Scanner input =new Scanner(System.in);
	StudentMember st[]=new StudentMember[50];
	public static int studentCount=0;
	FacultyMember ft[]=new FacultyMember[50];
	public static int facultyCount=0;
	public void addStudent(StudentMember s) {
		for(int i=0;i<studentCount;i++) {
			if(st[i].regNo==s.regNo) {
				System.out.println("Already Available.");
			}
		}
		if(studentCount<50) {
			st[studentCount]=s;
			studentCount++;
		}
		else {
			System.out.println("No Available Space.");
		}
	}
	public void addFaculty(FacultyMember f) {
		for(int i=0;i<facultyCount;i++) {
			if(ft[i].memberId==f.memberId) {
				System.out.println("Already Available.");
			}
		}
		if(facultyCount<50) {
			ft[facultyCount]=f;
			facultyCount++;
		}
		else {
			System.out.println("No Available Space.");
		}
	}
	public static int count;
	  public Book borrow() {
		  System.out.println("Enter BookId of the Book to Borrow:");
		  int sNo=input.nextInt();
		  for(int i=0;i<count;i++) {
			if(books[i].bookId==sNo) {
				System.out.println("Successfully Borrowed");
				books[i].availability--;
				return books[i];
			}else if(books[i].bookId==sNo && books[i].availability<=0) {
				System.out.println("Not currently Available Cannot Borrow.");
			}
		}
		  return null;
	  }
		public void returnBook() {
			 System.out.println("Enter BookId of the Book to Return:");
			 int sNo=input.nextInt();
			 int flag=0;
			for(int i=0;i<count;i++) {
				if(books[i].bookId==sNo){		
				System.out.println("Successfully Returned");
				books[i].availability++;
				flag=1;
			}
		}
			if(flag==0) {
					System.out.println("Cannot Return,Check BookId.");
			}
		}
		public void addBook(Book b) {
			for(int i=0;i<count;i++) {
				if(books[i].bookId==b.bookId) {
					System.out.println("Already Available.");
				}
			}
			if(count<50) {
				books[count]=b;
				count++;
			}
			else {
				System.out.println("No Available Space.");
			}
		}
		public void searchByBookId() {
			System.out.println("Enter BookID of the Book:");
			int sNo=input.nextInt();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(books[i].bookId==sNo) {
		    	System.out.println("BookId of the Book:"+books[i].bookId);
				System.out.println("Title of the Book:"+books[i].title);
				System.out.println("Author Name of the Book:"+books[i].author);
				System.out.println("Category of the Book:"+books[i].category);
				System.out.println("Availability of the Book:"+books[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}
		public void searchByTitle() {
			System.out.println("Enter Title of the Book:");
			String title=input.nextLine();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(books[i].title.equalsIgnoreCase(title)) {
		    	System.out.println("BookId of the Book:"+books[i].bookId);
				System.out.println("Title of the Book:"+books[i].title);
				System.out.println("Author Name of the Book:"+books[i].author);
				System.out.println("Category of the Book:"+books[i].category);
				System.out.println("Availability of the Book:"+books[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}
		public void searchByAuthor() {
			System.out.println("Enter Author of the Book:");
			String author=input.nextLine();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(books[i].author.equalsIgnoreCase(author)) {
		    	System.out.println("BookId of the Book:"+books[i].bookId);
				System.out.println("Title of the Book:"+books[i].title);
				System.out.println("Author Name of the Book:"+books[i].author);
				System.out.println("Category of the Book:"+books[i].category);
				System.out.println("Availability of the Book:"+books[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}
	 
}
	/*private int memberId;
	private String name;
	private String email;
	private long phone;
	Scanner input=new Scanner(System.in);
	public Member(int memberId,String name,String email,long phone) {
		this.memberId=memberId;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	public Member() {
	System.out.println("Enter MemberId:");
	this.memberId=input.nextInt();
	input.nextLine();
	System.out.println("Enter Name:");
	this.name=input.nextLine();
	System.out.println("Enter Email:");
	this.email=input.nextLine();
	System.out.println("Enter Phone:");
	this.phone=input.nextLong();input.nextLine();
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
	public Book borrow() {
		  System.out.println("Enter BookId of the Book to Borrow:");
		  int sNo=input.nextInt();
		  for(int i=0;i<count;i++) {
			if(borrow[i].bookId==sNo) {
				System.out.println("Successfully Borrowed");
				borrow[i].availability--;
				return borrow[i];
			}else if(borrow[i].bookId==sNo && borrow[i].availability<=0) {
				System.out.println("Not currently Available Cannot Borrow.");
			}
		}
		  return null;
	  }
		public void returnBook() {
			 System.out.println("Enter BookId of the Book to Return:");
			 int sNo=input.nextInt();
			 int flag=0;
			for(int i=0;i<count;i++) {
				if(borrow[i].bookId==sNo){		
				System.out.println("Successfully Returned");
				borrow[i].availability++;
				flag=1;
			}
		}
			if(flag==0) {
					System.out.println("Cannot Return,Check BookId.");
			}
		}
		public void addBook(Book b) {
			for(int i=0;i<count;i++) {
				if(borrow[i].bookId==b.bookId) {
					System.out.println("Already Available.");
				}
			}
			if(count<50) {
				borrow[count]=b;
				count++;
			}
			else {
				System.out.println("No Available Space.");
			}
		}
		public void searchByBookId() {
			System.out.println("Enter BookID of the Book:");
			int sNo=input.nextInt();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(borrow[i].bookId==sNo) {
		    	System.out.println("BookId of the Book:"+borrow[i].bookId);
				System.out.println("Title of the Book:"+borrow[i].title);
				System.out.println("Author Name of the Book:"+borrow[i].author);
				System.out.println("Category of the Book:"+borrow[i].category);
				System.out.println("Availability of the Book:"+borrow[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}
		public void searchByTitle() {
			System.out.println("Enter Title of the Book:");
			String title=input.nextLine();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(borrow[i].title.equalsIgnoreCase(title)) {
		    	System.out.println("BookId of the Book:"+borrow[i].bookId);
				System.out.println("Title of the Book:"+borrow[i].title);
				System.out.println("Author Name of the Book:"+borrow[i].author);
				System.out.println("Category of the Book:"+borrow[i].category);
				System.out.println("Availability of the Book:"+borrow[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}
		public void searchByAuthor() {
			System.out.println("Enter Author of the Book:");
			String author=input.nextLine();
			int flag=0;
			for(int i=0;i<count;i++) {
		    if(borrow[i].author.equalsIgnoreCase(author)) {
		    	System.out.println("BookId of the Book:"+borrow[i].bookId);
				System.out.println("Title of the Book:"+borrow[i].title);
				System.out.println("Author Name of the Book:"+borrow[i].author);
				System.out.println("Category of the Book:"+borrow[i].category);
				System.out.println("Availability of the Book:"+borrow[i].availability);
				flag=1;
		    }
		    if(flag==0) {
		    	System.out.println("Book Not Available.");
		    }
		}
		}	
		public Book borrow() {
			  System.out.println("Enter BookId of the Book to Borrow:");
			  int sNo=input.nextInt();
			  for(int i=0;i<count;i++) {
				if(borrow[i].bookId==sNo) {
					System.out.println("Successfully Borrowed");
					borrow[i].availability--;
					return borrow[i];
				}else if(borrow[i].bookId==sNo && borrow[i].availability<=0) {
					System.out.println("Not currently Available Cannot Borrow.");
				}
			}
			  return null;
		  }
			public void returnBook() {
				 System.out.println("Enter BookId of the Book to Return:");
				 int sNo=input.nextInt();
				 int flag=0;
				for(int i=0;i<count;i++) {
					if(borrow[i].bookId==sNo){		
					System.out.println("Successfully Returned");
					borrow[i].availability++;
					flag=1;
				}
			}
				if(flag==0) {
						System.out.println("Cannot Return,Check BookId.");
				}
			}
			public void addBook(Book b) {
				for(int i=0;i<count;i++) {
					if(borrow[i].bookId==b.bookId) {
						System.out.println("Already Available.");
					}
				}
				if(count<50) {
					borrow[count]=b;
					count++;
				}
				else {
					System.out.println("No Available Space.");
				}
			}
			public void searchByBookId() {
				System.out.println("Enter BookID of the Book:");
				int sNo=input.nextInt();
				int flag=0;
				for(int i=0;i<count;i++) {
			    if(borrow[i].bookId==sNo) {
			    	System.out.println("BookId of the Book:"+borrow[i].bookId);
					System.out.println("Title of the Book:"+borrow[i].title);
					System.out.println("Author Name of the Book:"+borrow[i].author);
					System.out.println("Category of the Book:"+borrow[i].category);
					System.out.println("Availability of the Book:"+borrow[i].availability);
					flag=1;
			    }
			    if(flag==0) {
			    	System.out.println("Book Not Available.");
			    }
			}
			}
			public void searchByTitle() {
				System.out.println("Enter Title of the Book:");
				String title=input.nextLine();
				int flag=0;
				for(int i=0;i<count;i++) {
			    if(borrow[i].title.equalsIgnoreCase(title)) {
			    	System.out.println("BookId of the Book:"+borrow[i].bookId);
					System.out.println("Title of the Book:"+borrow[i].title);
					System.out.println("Author Name of the Book:"+borrow[i].author);
					System.out.println("Category of the Book:"+borrow[i].category);
					System.out.println("Availability of the Book:"+borrow[i].availability);
					flag=1;
			    }
			    if(flag==0) {
			    	System.out.println("Book Not Available.");
			    }
			}
			}
			public void searchByAuthor() {
				System.out.println("Enter Author of the Book:");
				String author=input.nextLine();
				int flag=0;
				for(int i=0;i<count;i++) {
			    if(borrow[i].author.equalsIgnoreCase(author)) {
			    	System.out.println("BookId of the Book:"+borrow[i].bookId);
					System.out.println("Title of the Book:"+borrow[i].title);
					System.out.println("Author Name of the Book:"+borrow[i].author);
					System.out.println("Category of the Book:"+borrow[i].category);
					System.out.println("Availability of the Book:"+borrow[i].availability);
					flag=1;
			    }
			    if(flag==0) {
			    	System.out.println("Book Not Available.");
			    }
			}
			}	
			*/ 

