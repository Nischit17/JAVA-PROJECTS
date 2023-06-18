import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal:");
        double principal = in.nextDouble();

        System.out.println("Enter the rate:");
        double rate = in.nextDouble();

        System.out.println("Enter the time:");
        double time = in.nextDouble();

        double interest = ( principal * time * rate ) / 100;

        System.out.println("Principal:" + principal);
        System.out.println("Interest Rate:" + rate);
        System.out.println("Time Duration:" + time);
        System.out.println("Simple Interest:" + interest);

        in.close();

    }
}