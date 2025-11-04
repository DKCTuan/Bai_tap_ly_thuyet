package btqlkl;

public class Student extends Person {
    private String studentID;

    public Student(String studentID, String fullname, String email) {
        super(fullname, email);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "SV (ID: " + studentID + ") - " + super.toString();
    }
}
