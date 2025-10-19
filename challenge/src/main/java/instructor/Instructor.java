package instructor;


public class Instructor extends Person {
    private String employeeNumber;
    private Subject subject;

    public Instructor(String nom,String prenom, String telephone, String email, String employeeNumber, Subject subject ){
        super(prenom,nom,telephone,email);
        this.employeeNumber = employeeNumber;
        this.subject = subject;
    }
    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public String cleanEmployeeNumber(){
        return employeeNumber.replace(" ", "");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,secondName,firstName);
    }
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name      : ").append(secondName).append(", ").append(firstName).append("\n");
        sb.append("Email     : ").append(email).append("\n");
        sb.append("Phone     : ").append(phone).append("\n");
        return sb.toString();
    }
    public String displayName(){
        StringBuilder sb = new StringBuilder();
        if (firstName == null && secondName == null){
            sb.append("Unkown");
            return sb.toString();
        }
        else if (firstName == null){
            sb.append(secondName);
            return sb.toString();
        }
        else if (secondName == null){
            sb.append(firstName);
            return sb.toString();
        }
        else{
            sb.append(firstName).append(" ");
            sb.append(secondName);
            return sb.toString();
        }
    }

}
