package btqlkl;

public class ThesisManagement {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "Nguyễn Văn An", "an.nv@email.com");
        Student s2 = new Student("SV002", "Trần Thị Bình", "binh.tt@email.com");
        Student s3 = new Student("SV003", "Lê Văn Cường", "cuong.lv@email.com");

        Teacher t1 = new Teacher("GV01", "Phó Đức Trí", "tri.pd@email.com", "TS.");
        Advisor a1 = new Advisor("Ngô Bảo Châu", "chau.nb@email.com"); // Advisor ngoài trường

        ListSortable<KLTN<?, ?>> thesisList = new ListSortable<>();

        thesisList.add(new KLTN<>(s1, t1, "Xây dựng hệ thống quản lý thư viện"));
        thesisList.add(new KLTN<>(s2, a1, "Phân tích dữ liệu lớn với Spark"));
        thesisList.add(new KLTN<>(s3, t1, "Automation Test cho ứng dụng Mobile"));

        thesisList.print();
    }
}
