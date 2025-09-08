package librarySystem;

public class FacultyMember extends Member {
    private String designation;
    private int priority;

    public FacultyMember(int memberId, String name, String phone, String email, String designation, int priority) {
        super(memberId, name, phone, email);
        this.designation = designation;
        this.priority = priority;
    }

    @Override
    public int getBorrowLimit() {
        return 5; 
    }

    @Override
    public double calcFine(int daysLate) {
        return daysLate > 0 ? daysLate * 2.0 : 0; 
    }

    @Override
    public String toString() {
        return super.toString() + " | Designation: " + designation + " | Priority: " + priority;
    }
}
