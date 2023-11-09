package registration_system;

public class Faculty extends User{
    public String department;
    public Faculty (String n, Integer id, String d) {
        super(n, id);
        department=d;


    }

}
