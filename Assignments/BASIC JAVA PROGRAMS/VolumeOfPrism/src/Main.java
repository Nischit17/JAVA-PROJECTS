import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the area of base:");
        double base=in.nextDouble();

        System.out.println("Enter the height:");
        double height=in.nextDouble();

        double  area=base*height ;
        System.out.println("Volume Of Prism is: " + area);
    }
}