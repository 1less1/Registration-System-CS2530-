package registration_system;

public class RegistrationDriver {

    public static void main(String[] args) {
        Faculty teacher1= new Faculty("Mark Anthony",56740, "Computer Science");
        Student student1= new Student("Will Palma",696969, "Sophomore");

        Student student2= new Student("Giselle Vivero", 420420, "Freshman");

        Student student3= new Student("Devesh Desani", 45728, "Sophomore");

        Roster allAvailableStudents = new Roster();
        Roster classRoster = new Roster();

        Course csClass= new Course("Computer Aginization",classRoster.getRoster(),teacher1, 2) ;


        allAvailableStudents.addStudent(student1);
        allAvailableStudents.addStudent(student2);
        allAvailableStudents.addStudent(student3);
        //System.out.println(allAvailableStudents.returnRoster());

        for (Student x : allAvailableStudents.roster ) {
            //System.out.println(x);
            if (csClass.maxCap>0) {
                classRoster.addStudent(x);
                csClass.maxCap-=1;
            }
            else {
                System.out.println("Max capacity met. No more students are allowed to register for this class!");
            }


        }

        System.out.println("Course Name: "+csClass.courseName);
        csClass.getProf();
        classRoster.printRoster();





    }

}
