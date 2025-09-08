package librarySystem;
import java.util.Scanner;
public class LibraryAppMain {
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Books b1=new Books();
		Member m=new Member();
		while(true){
			System.out.println("1.AddStudent/t2.AddFaculty/t3.AddBookToStudent/t4.AddBookToFaculty/t5.Borrow/t6.ReturnBook/t7.SearchById/t8.SearchByAuthor/t9.SearchByTitle/t10.Exit");
			int choice =input.nextInt();
			input.nextLine();
	switch(choice) {
		case 1:
			StudentMember st=new StudentMember();
			m.addStudent(st);
			break;
		case 2:
			FacultyMember ft=new FacultyMember();
			m.addFaculty(ft);
			break;
		case 3:
			Book b=new Book();
			b1.addBook(b);
			break;
		case 4:
			break;
		case 5:
			b1.borrow();
			break;
		case 6:
			b1.returnBook();
			break;
		case 7:
			b1.searchByBookId();
			break;
		case 8:
			b1.searchByAuthor();
			break;
		case 9:
			b1.searchByTitle();
			break;
		case 10:
			System.out.println("Successfully Exited...");
			return;	
		default:
			System.out.println("Invalid Choice...");
			break;
		}
	}
	}

}
