package btqlkl;

public class Teacher extends Person {
    private String teacherID;
    private String title; // Chức danh (ví dụ: TS, ThS)

    public Teacher(String teacherID, String fullname, String email, String title) {
        super(fullname, email);
        this.teacherID = teacherID;
        this.title = title;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "GV (ID: " + teacherID + ") - " + title + ". " + super.toString();
    }
}

