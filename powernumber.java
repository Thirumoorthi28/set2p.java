import java.util.Scanner;
public class Powernumber{
    public static void main(String args[]){
        int base, exponent;
        Scanner s=new Scanner(System.in);
        base=s.nextInt();
        exponent=s.nextInt();
        System.out.println("Enter The value :");
        long result = 1;
        for (;exponent != 0; --exponent)
        {
            result *= base;
        }
        System.out.println("The Power Of Numer is : " + result);
    }
}
