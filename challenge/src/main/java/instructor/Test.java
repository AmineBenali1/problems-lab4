package instructor;

public class Test {
    public static void main(String[] args){
        Subject quantum = new Subject(1,"INTRO- quantum","introduction to quantum physics");
        Instructor ins1 = new Instructor("Benali","Amine","06000000","ab@gmail.com"," GB 100 ", quantum);
        System.out.println(ins1.cleanEmployeeNumber());
        System.out.println(quantum.normalizedCode());
        System.out.println(quantum.properTitle());
        System.out.println(ins1.summaryLine());
        System.out.println(quantum.isIntroCourse());
        System.out.println(ins1.toCard());
        System.out.println(quantum.syllabusLine(ins1));
        System.out.println(ins1.displayName());

    }
}
