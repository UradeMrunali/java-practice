import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets calculate Age");
        System.out.print("Enter your Age: ");
        int age= sc.nextInt();

        if(age >= 65){
            System.out.println("You are a senior citizen");
        } else if (age >= 20) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else{
            System.out.println("Baby you are a child");
        }
    }
}
