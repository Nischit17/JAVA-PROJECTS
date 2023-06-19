import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  dis,amount,markedprice,s;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Markedprice: ");
        markedprice= in.nextDouble();

        System.out.println("Enter Discount Percentage: ");
        dis= in.nextDouble();

        s=100-dis;
        amount= (s*markedprice)/100;

        System.out.println("Amount after discount="+amount);
    }
}