import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        Collections.addAll(fruits,"Apple", "Banana" , "Orange" , "Mango" , "Kiwi");
        System.out.println("Fruits in the list are: "+ fruits);

        Collections.sort(fruits);
        System.out.println("Sorted list:" + fruits);

        int mangoIndex = fruits.indexOf("Mango");
        
        if(mangoIndex != -1){
            System.out.println("Mango is at the index of: " + mangoIndex);
        } else{
            System.out.println("Mango is not in the list");
        }

        if(fruits.contains("Papaya")){
            System.out.println("Yes Papaya is available in list");
        }else{
            System.out.println("No papaya is unavailable ");
        }
    }
}
