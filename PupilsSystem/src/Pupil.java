/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Pupil {
    public String name;
    public String parentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Pupil(String name, String parentName) {
        this.name = name;
        this.parentName = parentName;
    }
}
