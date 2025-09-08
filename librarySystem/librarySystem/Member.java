package librarySystem;

import java.util.*;

public abstract class Member {
    protected int memberId;
    protected String name;
    protected String phone;
    protected String email;
    protected List<Book> borrowedBooks;

    public Member(int memberId, String name, String phone, String email) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public abstract int getBorrowLimit();
    public abstract double calcFine(int daysLate);

    public boolean borrow(Book book) {
        if (borrowedBooks.size() < getBorrowLimit() && book.getAvailability() > 0) {
            borrowedBooks.add(book);
            book.borrowBook();
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book, int daysLate) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            double fine = calcFine(daysLate);
            if (fine > 0)
                System.out.println("Book returned late. Fine = ₹" + fine);
            else
                System.out.println("Book returned on time. No fine.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return memberId + " | " + name + " | " + phone + " | " + email;
    }
}
