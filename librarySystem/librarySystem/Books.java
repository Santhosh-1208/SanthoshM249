package librarySystem;
import java.util.Scanner;
public class Books {
	Book books[]=new Book[50];
	Scanner input=new Scanner(System.in);
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
		/*
		public int calFine(int days) {
			if(days>this.days) {
				return days*10;
			}else {
				return 0;
			}
		}
		*/
}
