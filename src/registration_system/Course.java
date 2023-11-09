package registration_system;

import java.util.ArrayList;

public class Course {

    public String courseName;

    public ArrayList roster;
    public Faculty assignedTeacher;

     public Integer maxCap;

    public Course (String cN, ArrayList r, Faculty aT, Integer mC ) {
        courseName=cN;
        roster = r;
        assignedTeacher=aT;
        maxCap=mC;

    }


    /* public void minusCap () {
            maxCap -= 1;
        }

     */

    public void getProf() {
        System.out.println("Professor: "+assignedTeacher.getName());
    }
}
