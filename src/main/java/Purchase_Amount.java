import java.util.Scanner;

public class Purchase_Amount
{
    public static void discount()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter purchase amount");
        int amount=s.nextInt();
        int temp;
        int discount;
        if(amount<500)
        {
            System.out.println("No discount");
        } else if (amount>=500 ||amount<=1000)
        {
            discount=((amount*10)/100);
            System.out.println("The discount applied"+" "+discount);
        } else if (amount>1000)
        {
            discount=((amount*20)/100);
        }
    }

    public static void main(String[] args) {
        discount();
    }
}
