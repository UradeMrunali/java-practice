public class PrimeChecker {
   static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 55;
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}
