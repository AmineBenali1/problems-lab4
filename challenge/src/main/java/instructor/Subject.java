package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;

    public Subject(int id, String code, String title){
        this.id = id;
        this.code = code;
        this.title = title;
    }
    // getters and setters

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String normalizedCode(){
        return code.replace(" ","").toUpperCase();
    }
    public String properTitle(){
        String[] words = title.toLowerCase().split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            output.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return output.toString();
    }
    public boolean isIntroCourse() {
        if (title.toLowerCase().contains("intro") || code.toUpperCase().startsWith("INTRO-")){
            return true;
        }
        return false;
    }
    public String syllabusLine(Instructor instructor){
        StringBuilder sb = new StringBuilder();
        sb.append("\" ").append(code).append(" - ").append(title).append(" ");
        sb.append("(Instructor: ").append(instructor.getSecondName());
        sb.append(" ").append(instructor.getFirstName());
        sb.append("\"");
        return sb.toString();
    }
}
