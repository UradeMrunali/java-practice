public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 122;
        PalindromeCheck obj = new PalindromeCheck();
        boolean pal=obj.isPalindrome(num);
        if(pal){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }    
    public boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return original == reversed;
    }
}
