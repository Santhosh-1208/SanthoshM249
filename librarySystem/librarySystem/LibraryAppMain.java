package librarySystem;

import java.util.*;

public class LibraryAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student Member");
            System.out.println("3. Add Faculty Member");
            System.out.println("4. List Books");
            System.out.println("5. List Members");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Search Book");
            System.out.println("9. List Borrowed Books by Member");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: 
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter Number of Copies: ");
                    int copies = sc.nextInt();
                    service.addBook(new Book(bid, title, author, category, copies));
                    System.out.println("Book added successfully.");
                    break;

                case 2: 
                    System.out.print("Enter Member ID: ");
                    int sid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String sphone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String semail = sc.nextLine();
                    System.out.print("Enter Semester: ");
                    int sem = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    service.addMember(new StudentMember(sid, sname, sphone, semail, sem, dept));
                    System.out.println("Student member added.");
                    break;

                case 3: 
                    System.out.print("Enter Member ID: ");
                    int fid = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String fphone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String femail = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    service.addMember(new FacultyMember(fid, fname, fphone, femail, designation, priority));
                    System.out.println("Faculty member added.");
                    break;

                case 4: service.listBooks(); break;
                case 5: service.listMembers(); break;

                case 6: 
                    System.out.print("Enter Member ID: ");
                    int mid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    bid = sc.nextInt();
                    Member m = service.getMemberById(mid);
                    Book b = service.search(bid);
                    if (m != null && b != null && m.borrow(b)) {
                        System.out.println("Book issued successfully:");
                        System.out.println(b);
                    } else {
                        System.out.println("Issue failed.");
                    }
                    break;

                case 7:
                    System.out.print("Enter Member ID: ");
                    mid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    bid = sc.nextInt();
                    System.out.print("Enter days late: ");
                    int daysLate = sc.nextInt();
                    m = service.getMemberById(mid);
                    b = service.search(bid);
                    if (m != null && b != null && m.returnBook(b, daysLate)) {
                        System.out.println("Book returned successfully:");
                        System.out.println(b);
                    } else {
                        System.out.println("Return failed.");
                    }
                    break;

                case 8: 
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String t = sc.nextLine();
                    b = service.search(t);
                    System.out.println(b != null ? b : "Not found");
                    break;

                case 9: 
                    System.out.print("Enter Member ID: ");
                    mid = sc.nextInt();
                    m = service.getMemberById(mid);
                    if (m != null) {
                        System.out.println("Borrowed books for " + m.getName() + ":");
                        if (m.getBorrowedBooks().isEmpty())
                            System.out.println("No books borrowed.");
                        else
                            for (Book borrowed : m.getBorrowedBooks())
                                System.out.println(borrowed);
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 10:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
