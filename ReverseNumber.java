public class ReverseNumber {
    public static int reverseNum(int num){
        int rev = 0;

        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int original = 1234;
        int reversed = reverseNum(original);
        System.out.println("Your original num = " + original);
        System.out.println("Reversed num = " + reversed);

    }
}
