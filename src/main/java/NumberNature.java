import java.util.Scanner;

public class NumberNature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = s.nextInt();
        if (a > 0) {
            System.out.println("The Number is positive" + a);
        } else {
            System.out.println("The number is Nagetive" + a);
        }


    }
}
