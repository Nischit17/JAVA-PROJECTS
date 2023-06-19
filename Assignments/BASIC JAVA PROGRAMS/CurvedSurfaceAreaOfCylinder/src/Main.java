import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r=in.nextDouble();

        System.out.println("Enter the height:");
        double h=in.nextDouble();

        double  tsa=((2*22*r)/7)*(r+h);
        System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
    }
}