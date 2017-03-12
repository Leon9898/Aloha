import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class SystemRealisationForPupils {
    public static ArrayList<String> foodList = new ArrayList<String>();
    public static String currentFood;

    public static void main(String[] args) {
        buyFood(foodList, currentFood);
    }

    public static void buyFood(ArrayList<String> foodList, String currentFood){
        int counter = 0;
        for(int i = 0; i < foodList.size(); i++){
            if (currentFood.equals(foodList.get(i))) System.out.println("Pls havai");
            else counter++;
        }

        if(counter == foodList.size()) System.out.println("Sorry, takogo nety");
    }
}
