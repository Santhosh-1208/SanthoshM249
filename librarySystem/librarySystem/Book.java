package librarySystem;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private String category;
	private int availability;
	private int days;
	public Book(int bookId,String title,String author,String category,int availability,int days) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.category=category;
		this.availability=availability;
		this.days=days;
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
	public int setBookId() {
		return this.bookId;
	}
	public String setTitle() {
		return this.title;
	}
	public String setAutor() {
		return this.author;
	}
	public int setAvailability() {
		return this.availability;
	}
	public String setCategory() {
		return this.category;
	}
    public void borrow(String title,int count) {
		if(this.title.equalsIgnoreCase(title)&&this.availability>=count) {
			this.availability=this.availability-count;
			System.out.println("Successfully Borrowed");
		}else {
			System.out.println("Not Available");
		}
		
	}
	public void returnBook(String title,int count,int days) {
		if(this.title.equalsIgnoreCase(title)&&days<=this.days) {
			this.availability=this.availability+count;
			System.out.println("Successfully Returned");
		}else if(this.title.equalsIgnoreCase(title)&&days>this.days) {
			int fine=calFine(days);
			System.out.println("Fine Amount="+fine);
		}else {
			System.out.println("Cannot Return");
		}
	}
	public int calFine(int days) {
		if(days>this.days) {
			return days*10;
		}else {
			return 0;
		}
	}
	boolean search(int bookId) {
	    if(this.bookId==(bookId)) {
			return true;
		}
		
	    return false;
	}
	boolean search(String key) {
		if(this.title.equals(key)||this.author.equals(key)) {
			return true;
		}
		
		return false;
		
	}
}
