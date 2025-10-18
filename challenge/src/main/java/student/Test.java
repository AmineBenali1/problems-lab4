package student;

public class Test {
    public static void main(String[] args) {
        Major CS = new Major("23","CS");
        Major maths = new Major("20","maths");
        Student s1 = new Student("Amal","Safi","0612345678","amalSafi@gmail.com","22885676",CS);
        Student s2 = new Student("Samir","Alami","0698765432","samirAlami@gmail.com","23585976",CS);
        CS.addStudent(s1);
        CS.addStudent(s2);
        Student s3 = new Student("Amine", "Benali", "0655555555", "amineBenali@gmail.com","30303030",maths);
        maths.addStudent(s3);
        // Display computer science students
        System.out.println("The list of students in the computer science major is:");
        CS.getStudentListAsString();
        // find by CNE
        if(CS.findStudentByCNE("23585976") != null){
            System.out.println("\nStudent Found: "+ (CS.findStudentByCNE("23585976").toString()));
        }
        else System.out.println("\nStudent not found");
        // delete by CNE
        if(CS.removeStudent("23585976")){
            System.out.println("\nStudent removed");
        }
        else System.out.println("\nStudent not found");
        // Occupancy Rate
        System.out.println("\nComputer Science capacity: " + CS.getCAPACITY() + " students");
        System.out.println("Current enrollment: "+ CS.getStudentCount() + " students");
        System.out.println("Occupancy rate = " + CS.getOccupancyRate() + "%");

    }
}

