import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("Enter third Number");
        int c = s.nextInt();
        if (a < b) {
            System.out.println("A is smallest");
        } else if (b < c) {
            System.out.println("B is smallest");
        } else if (c<a) {
            System.out.println("C is smallest");
        }
    }
}
