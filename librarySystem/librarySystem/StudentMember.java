package librarySystem;

public class StudentMember extends Member {
    private int semester;
    private String dept;

    public StudentMember(int memberId, String name, String phone, String email, int semester, String dept) {
        super(memberId, name, phone, email);
        this.semester = semester;
        this.dept = dept;
    }

    @Override
    public int getBorrowLimit() {
        return 3; 
    }

    @Override
    public double calcFine(int daysLate) {
        return daysLate > 0 ? daysLate * 5.0 : 0; // ₹5/day late
    }

    @Override
    public String toString() {
        return super.toString() + " | Dept: " + dept + " | Sem: " + semester;
    }
}
