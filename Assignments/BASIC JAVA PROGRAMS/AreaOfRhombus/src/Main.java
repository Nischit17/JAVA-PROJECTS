import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the diagonal 1:");
        double d1= in.nextDouble();

        System.out.println("Enter the diagonal 2:");
        double d2= in.nextDouble();

        double  area=(d1*d2)/2;
        System.out.println("Area of Rhombus is: " + area);
    }
}