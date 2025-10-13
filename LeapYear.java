import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator");
        System.out.print("Enter the year you want to check: ");
        int year= sc.nextInt();
        
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is not a Leap Year");
        }
    }
}
