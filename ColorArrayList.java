import java.util.ArrayList;

public class ColorArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        colors.add("Green");
        colors.add("Red");
        System.out.println("All color in the list are: " + colors);

        colors.add(2,"Orange");
        System.out.println("After adding new color: " + colors);

        colors.remove(4);
        System.out.println("After removing color of index 4: "+ colors);

        if (colors.contains("Blue")){
            System.out.println("Yes Blue color is in this list");
        } else {
            System.out.println("No there is no Blue color available");
        }
    }
}