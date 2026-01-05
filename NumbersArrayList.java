import java.util.ArrayList;
import java.util.Collections;
public class NumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(70);
        numbers.add(30);
        numbers.add(90);
        numbers.add(100);
        numbers.add(60);
        System.out.println("Numbers in list are: " + numbers);

        int max = Collections.max(numbers);
        System.out.println("Maximum number is: " + max);

        int min =  Collections.min(numbers);
        System.out.println("Minimum number is: " + min);

        int sum = 0;
        for(int num : numbers){
           sum += num ;
        }
        double average = (double) sum / numbers.size();
        System.out.println("Average of the numbers in list is: " + average);

        numbers.removeIf(n -> n < 60 );
        System.out.println("After removing number less than 60 remaining list is: " + numbers);
    }
}


