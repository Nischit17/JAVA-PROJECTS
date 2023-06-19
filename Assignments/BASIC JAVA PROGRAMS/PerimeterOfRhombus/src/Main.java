import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the Rhombus:");
        double a= in.nextDouble();

        double  perimeter=4*a;
        System.out.println("perimeter of Rhombus is: " + perimeter);
    }
}