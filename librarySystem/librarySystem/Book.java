package librarySystem;
import java.util.Scanner;
public class Book  {
	public int bookId;
	public String title;
	public String author;
	public String category;
	public int availability;
	Scanner input=new Scanner(System.in);
	public Book(int bookId,String title,String author,String category,int availability) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.category=category;
		this.availability=availability;
	}
	public Book() {
		System.out.println("Enter BookId of the Book:");
		this.bookId=input.nextInt();
		input.nextLine();
		System.out.println("Enter Title of the Book:");
		this.title=input.nextLine();
		System.out.println("Enter Author Name of the Book:");
		this.author=input.nextLine();
		System.out.println("Enter Category of the Book:");
		this.category=input.nextLine();
		System.out.println("Enter Availability of the Book:");
		this.availability=input.nextInt();input.nextLine();
	}
	public void setBookId(int bookId) {
		this.bookId=bookId;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAutor(String author) {
		this.author=author;
	}
	public void setAvailability(int availability) {
		this.availability=availability;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public int getBookId() {
		return this.bookId;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAutor() {
		return this.author;
	}
	public int getAvailability() {
		return this.availability;
	}
	public String getCategory() {
		return this.category;
	}
}
