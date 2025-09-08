package librarySystem;

import java.util.*;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }
    public void addMember(Member m) { members.add(m); }

    public Book search(int bookId) {
        for (Book b : books) if (b.getBookId() == bookId) return b;
        return null;
    }

    public Book search(String title) {
        for (Book b : books) if (b.getTitle().equalsIgnoreCase(title)) return b;
        return null;
    }

    public Member getMemberById(int memberId) {
        for (Member m : members) if (m.getMemberId() == memberId) return m;
        return null;
    }

    public void listBooks() {
        if (books.isEmpty()) System.out.println("No books in library.");
        for (Book b : books) System.out.println(b);
    }

    public void listMembers() {
        if (members.isEmpty()) System.out.println("No members in library.");
        for (Member m : members) System.out.println(m);
    }
}
