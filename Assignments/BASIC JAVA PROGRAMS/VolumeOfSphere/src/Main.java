import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of sphere:");
        double r=in.nextDouble();

        double  volume= (4*22*r*r*r)/(3*7);
        System.out.println("Volume is:" +volume);
    }
}