package registration_system;

// Abstract = you can't instantiate this class, you have to subclass it first
public abstract class User {
    private String name;

    private Integer idNumber;

    public User(String n, Integer id) {
        name=n;
        idNumber=id;
    }

    public String getName() {
        return name;
    }




}
