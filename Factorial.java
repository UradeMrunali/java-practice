public class Factorial {
    int printFactorial (int n){
        int num = 1;
        for (int i = 1 ; i <= n; i++) {
            num = num * i;
        }
            return num;
    }
    public static void main(String[] args) {
        Factorial a = new Factorial();
        int n = 6;
      int result=  a.printFactorial( n);
        System.out.println("Factorial of " + n + " = " + result);
    }
}




