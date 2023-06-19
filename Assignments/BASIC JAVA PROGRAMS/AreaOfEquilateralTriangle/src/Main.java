import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the Triangle:");
        double a= in.nextDouble();

        double  area=(Math.sqrt(3)/4)*(a*a);
        System.out.println("Area of Triangle is: " + area);
    }
}