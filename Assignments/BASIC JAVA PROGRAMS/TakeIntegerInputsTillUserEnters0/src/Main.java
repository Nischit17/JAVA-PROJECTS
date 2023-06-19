import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        do{
            System.out.println("Enter the number: ");
            num = in.nextInt();
            System.out.println("Enter 0 to end the loop");
            sum += num;
        }while (num > 0);

        System.out.println("Sum is "+ sum);
    }
}