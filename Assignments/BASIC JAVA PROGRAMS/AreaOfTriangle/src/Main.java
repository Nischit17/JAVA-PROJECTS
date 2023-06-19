import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double b= in.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double h= in.nextDouble();

        double area=(b*h)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}