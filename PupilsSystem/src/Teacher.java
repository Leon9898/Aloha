/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Teacher {
    public String name;
    public String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }


}
