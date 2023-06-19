import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;double res=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many numbers to cal avg:");
        n=in.nextInt();

        int a[]=new int[n];
        System.out.println("enter   "+n+"  numbers");

        for(int i=0;i<n;i++)
            a[i]=in.nextInt();

        for(int i=0;i<n;i++)
            res =res+a[i];

        System.out.println("average="+res/n);
    }
}