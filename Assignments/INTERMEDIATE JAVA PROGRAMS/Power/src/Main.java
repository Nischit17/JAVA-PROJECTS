import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,p,r=1;
        System.out.println("Enter Number:");
        n=in.nextLong();

        System.out.println("Enter Power:");
        p=in.nextLong();

        if(n >=0 && p == 0)
        {
            r =1;
        }
        else if(n ==0 && p >= 1)
        {
            r=0;
        }
        else
        {
            for(int i=1;i<=p;i++)
            {
                r=r *n;
            }
        }
        System.out.println(n+"^"+p+"="+r);
    }
}