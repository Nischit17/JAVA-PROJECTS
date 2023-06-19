import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n,factorial=1;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter number:");
        n=in.nextLong();

        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial="+factorial);
    }
}