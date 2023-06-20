import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long amount,deppercent,year,afterdep,temp;

        System.out.println("Enter Amount");
        amount=in.nextLong();

        System.out.println("Enter Depreciation percentage");
        deppercent=in.nextLong();

        System.out.println("Enter  number of years");
        year=in.nextLong();

        temp=amount;

        for(int i=0;i<year;i++)
            temp=((100-deppercent)*temp)/100;
        System.out.println("After depreciation = "+temp);
    }
}