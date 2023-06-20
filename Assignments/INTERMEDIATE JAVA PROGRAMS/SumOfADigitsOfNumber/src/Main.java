import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n,sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n=in.nextLong();
        for(sum=0 ;n!=0 ;n/=10)
        {
            sum+=n%10;
        }
        System.out.println("Sum of digits of a number is: "+sum);
    }
}