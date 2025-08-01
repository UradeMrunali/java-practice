public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[8]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: You're trying to access an invalid index!");
        } finally {
            System.out.println("This is program of checking try catch and finally block");

    }
}