import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.printf("The LCM of " + num1 + " and " + num2 + " is " + lcm);
                break;
            }
            ++lcm;
        }
    }
}