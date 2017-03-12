import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class SystemRealisationForTeachers {
    public static ArrayList<Pupil> pupilsListOfLyubimchiki = new ArrayList<Pupil>();
    public static ArrayList<Pupil> pupilsListOfVapers = new ArrayList<Pupil>();
    public static ArrayList<Subject> subjectsListOfCurrentPezdyuk = new ArrayList<Subject>();


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Galina", "Matan");
        Pupil pupil = new Pupil("Leha", "Ded");
        setTheMark(pupilsListOfLyubimchiki, pupilsListOfVapers, subjectsListOfCurrentPezdyuk,pupil, teacher.subject );

    }

    public static void setTheMark(ArrayList<Pupil> pupilsListOfLyubimchiki, ArrayList<Pupil> pupilsListOfVapers, ArrayList<Subject> subjectsListOfCurrentPezdyuk, Pupil pupil, String currentSubjectName){
        for(int i = 0; i < pupilsListOfLyubimchiki.size(); i++){
            if (pupil.name.equals(pupilsListOfLyubimchiki.get(i).name)) {
                for(int j = 0; j < subjectsListOfCurrentPezdyuk.size(); j++) {
                    if (currentSubjectName.equals(subjectsListOfCurrentPezdyuk.get(j).name)) subjectsListOfCurrentPezdyuk.get(j).mark = 5;
                }
            }
        }

        for(int i = 0; i < pupilsListOfVapers.size(); i++){
            if (pupil.name.equals(pupilsListOfVapers.get(i).name)) {
                for(int j = 0; j < subjectsListOfCurrentPezdyuk.size(); j++) {
                    if (currentSubjectName.equals(subjectsListOfCurrentPezdyuk.get(j).name)) subjectsListOfCurrentPezdyuk.get(j).mark = 2;
                }
            }
        }
    }


}
