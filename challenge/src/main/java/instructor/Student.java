package instructor;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        this(prenom,nom,telephone,email,cne);
        this.major = major;
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        major = new Major("23","CS");
    }


    // Getters
    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }
    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    public String getFullNameFormatted(){
        StringBuilder sb = new StringBuilder();
        sb.append(secondName.toUpperCase());
        sb.append(", ");
        sb.append(firstName);
        return sb.toString();
    }
    @Override
    public String toString() {
        return id + ". " + cne + " " + getFullNameFormatted();
    }
}

