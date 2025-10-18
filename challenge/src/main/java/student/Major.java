package student;

public class Major {
    private static int nextId = 1;
    private int CAPACITY = 50;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(){
        this("","");
    }
    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        students = new Student[CAPACITY];
        id = nextId++;
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount == 50){
            System.out.println("Maximum number of students in this major");
        }
        else{
            students[studentCount] = s;
            studentCount++;
        }
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student findStudentByCNE(String cne){
        for(int i=0; i< studentCount; i++){
            if(students[i].getCne().equals(cne)) return students[i];
        }
        return null;
    }
    public boolean removeStudent(String cne){
        if(findStudentByCNE(cne) == null) return false;
        Student[] students2 = new Student[CAPACITY];
        int idx = 0;
        for(int i=0; i < studentCount; i++){
            if(students[i].getCne().equals(cne)) continue;
            students2[idx] = students[i];
            idx++;
        }
        students = students2;
        studentCount--;
        return true;
    }
    public double getOccupancyRate(){
        return  ( (double) studentCount / CAPACITY) * 100;
    }
    // Display all students in the major
    public void getStudentListAsString() {
        for(int i=0; i<studentCount; i++){
            // the toString() uses getFullNameFormatted() that uses StringBuilder
            System.out.println(students[i].toString());
        }
    }


}
