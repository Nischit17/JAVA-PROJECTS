import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long Matches,runs,innings,notout;
        double avg;

        System.out.println("Enter the number of matches played:");
        Matches=in.nextLong();

        while(true)
        {
            System.out.println("Enter the number innings batted:");
            innings=in.nextLong();

            if(innings<=Matches)
                break;
            System.out.println("Enter the number innings batted correctly <=matches:");
        }


        while(true)
        {
            System.out.println("Enter number of times notout:");
            notout=in.nextLong();

            if(notout<=innings)
                break;
            System.out.println("Enter the number times became notout correctly <=innings:");
        }

        System.out.println("Enter runs scored:");

        runs=in.nextLong();

        if(innings==notout)
            avg=runs;
        else
            avg=runs/(innings-notout);

        System.out.println("Batting average="+avg);
    }
}