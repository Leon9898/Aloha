/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Parent {
    public String name;
    public String childName;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getChildName(){
        return getChildName();
    }

    public void setChildName(String childName){
        this.childName = childName;
    }

    public Parent(String name, String childName){
       this.name = name;
       this.childName = childName;
    }
}
