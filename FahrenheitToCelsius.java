import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Welcome to Temperature Converter");
        System.out.print("Enter your Temp in F: ");
        float f= sc.nextFloat();
        float cel= (f-32)*5/9;
        System.out.println("Your temperature is : "+ cel +"C");
    }
}
