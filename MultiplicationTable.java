public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 9;

        printTable(num);
    }
    static void printTable (int num) {
        System.out.println("Table of "+ num + ":");
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num+ "*" + i + "=" + (num * i));
        }
    }
}
