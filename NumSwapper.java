public class NumSwapper {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        
        System.out.println("Initial Numbers:");
        displayNumbers(a,b);

        swapNumbers(a,b)
    }


    
    static void swapNumbers (int a, int b){
        int c = a;
        a = b;
        b = c ;
        System.out.println("Swaped Numbers: ");
        System.out.println("a = "+ a + ", b = "+ b);
    }
   static void displayNumbers (int a, int b){
        System.out.println("a = "+ a + ", b = "+ b);
    }
}
