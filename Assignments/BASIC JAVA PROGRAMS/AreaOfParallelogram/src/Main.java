import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height:");
        double d1= in.nextDouble();

        System.out.println("Enter the breadth:");
        double d2= in.nextDouble();

        double  area=(d1*d2) ;
        System.out.println("Area of Parallelogram is: " + area);
    }
}