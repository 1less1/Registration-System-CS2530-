package registration_system;

public class Student extends User {
    public String classification;
    public Student(String n, Integer id, String c) {
        super(n, id);
        classification=c;

    }


}
