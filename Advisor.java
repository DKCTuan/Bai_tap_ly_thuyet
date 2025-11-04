package btqlkl;

public class Advisor extends Person {
    public Advisor(String fullname, String email) {
        super(fullname, email);
    }

    @Override
    public String toString() {
        return "Advisor (Ngoài trường) - " + super.toString();
    }
}
