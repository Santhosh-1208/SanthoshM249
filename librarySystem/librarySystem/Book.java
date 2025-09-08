package librarySystem;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private int availability; // number of copies available

    public Book(int bookId, String title, String author, String category, int availability) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.availability = availability;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public int getAvailability() { return availability; }

    public void borrowBook() {
        if (availability > 0) {
            availability--;
        }
    }

    public void returnBook() {
        availability++;
    }

    @Override
    public String toString() {
        return bookId + " | " + title + " | " + author + " | " + category +
               " | Copies available: " + availability;
    }
}
