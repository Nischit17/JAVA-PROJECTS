import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        double a= in.nextDouble();

        double  perimeter=4*a;
        System.out.println("perimeter of Square is: " + perimeter);
    }
}