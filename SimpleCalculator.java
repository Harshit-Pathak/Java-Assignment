import java.util.*;

class SimpleCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String input1=sc.nextLine();
        double n1=Double.parseDouble(input1);
        
        System.out.println("Enter a numeric value: ");
        String input2 = sc.nextLine();
        double n2 = Double.parseDouble(input2);
       

        double res=n1+n2;

        System.out.println("The answer is: "+res);

    }
}