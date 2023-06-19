import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle:");
        double l= in.nextDouble();

        System.out.println("Enter the width of the Rectangle:");
        double b= in.nextDouble();

        double  perimeter=2*(l+b);
        System.out.println("perimeter of Rectangle is: " + perimeter);
    }
}