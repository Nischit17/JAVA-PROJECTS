import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height of the Parallelogram:");
        double h= in.nextDouble();

        System.out.println("Enter the breadth of the Parallelogram:");
        double b= in.nextDouble();

        double  perimeter=2*(h+b);
        System.out.println("perimeter of Parallelogram is: " + perimeter);
    }
}