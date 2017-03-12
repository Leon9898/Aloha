/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Subject {
    public String name;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
