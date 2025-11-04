package btqlkl;

public abstract class Person {
    protected String fullname;
    protected String email;

    public Person(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Họ tên: " + fullname + ", Email: " + email;
    }
}