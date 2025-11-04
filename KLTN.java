package btqlkl;

public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<?, ?>> {
    private T student;
    private V instructor;
    private String thesisName;

    public KLTN(T student, V instructor, String thesisName) {
        this.student = student;
        this.instructor = instructor;
        this.thesisName = thesisName;
    }

    public T getStudent() {
        return student;
    }

    public V getInstructor() {
        return instructor;
    }

    public String getThesisName() {
        return thesisName;
    }

    /**
     * Phương thức so sánh để phục vụ việc sắp xếp.
     * Sắp xếp theo thứ tự bảng chữ cái của tên khoá luận (thesisName).
     */
    @Override
    public int compareTo(KLTN<?, ?> other) {
        // Sử dụng compareTo của String để so sánh tên khoá luận
        return this.thesisName.compareTo(other.getThesisName());
    }

    @Override
    public String toString() {
        return "==========================================\n" +
                "Tên KLTN: " + thesisName + "\n" +
                "  > Sinh viên: " + student.toString() + "\n" +
                "  > Hướng dẫn: " + instructor.toString() + "\n";
    }
}
