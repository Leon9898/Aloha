import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class SystemRealisationForParents {

    public static ArrayList<Pupil> pupilsList = new ArrayList<Pupil>();
    public static ArrayList<Subject> subjectsListOfCurrentPezdyuk = new ArrayList<Subject>();

    public static void main(String[] args) {
        Parent parent = new Parent("John", "Moron");
        giveMeMarksOfMyPezdyuk(parent, subjectsListOfCurrentPezdyuk);
    }

    public static void giveMeMarksOfMyPezdyuk(Parent parent, ArrayList<Subject> subjectsListOfCurrentPezdyuk){
        for(int i = 0; i < pupilsList.size(); i++){
            if (parent.getChildName().equals(pupilsList.get(i).getName())){
                 for(int j = 0; j < subjectsListOfCurrentPezdyuk.size(); j++){
                     System.out.println(subjectsListOfCurrentPezdyuk.get(j).name + subjectsListOfCurrentPezdyuk.get(j).mark);
                 }
            }
        }
    }








}
