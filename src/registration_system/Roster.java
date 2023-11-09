package registration_system;

import java.util.ArrayList;

public class Roster {

    public ArrayList<Student> roster= new ArrayList<Student>();

    public void addStudent(Student s) {
        roster.add(s);
    }

    public void printRoster() {
        System.out.print("Class Roster: ");
        for (Student s : roster) {
            System.out.print(s.getName()+", ");
        }
    }

    public ArrayList getRoster() {
        return roster;
    }



}
