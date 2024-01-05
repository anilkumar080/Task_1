import java.util.Scanner;

public class NumberReverse
{
    public static void rev()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");

        int num=s.nextInt();
        int remainder=0;
        int reverse=0;
        while(num>0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println("The Reverse of number"+reverse);

    }

    public static void main(String[] args) {
        rev();
    }
}
