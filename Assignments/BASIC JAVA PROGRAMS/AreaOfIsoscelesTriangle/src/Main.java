import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of same sided");
        double a= in.nextDouble();

        System.out.println("Enter the side2 of the Triangle");
        double b= in.nextDouble();

        double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));

        System.out.println("Area of Isosceles Triangle is: " + area);
    }
}