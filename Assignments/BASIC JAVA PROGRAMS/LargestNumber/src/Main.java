import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne, numberTwo, Largest;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        numberOne = in.nextInt();

        System.out.println("Enter the second number:");
        numberTwo = in.nextInt();

        if(numberOne > numberTwo )
            Largest = numberOne;
        else
            Largest = numberTwo;
        System.out.println("Largest = " + Largest);
    }
}