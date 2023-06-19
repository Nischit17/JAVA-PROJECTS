import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length:");
        double l= in.nextDouble();

        System.out.println("Enter the breadth:");
        double b= in.nextDouble();

        double  area=l*b;
        System.out.println("Area of Rectangle is: " + area);
    }
}