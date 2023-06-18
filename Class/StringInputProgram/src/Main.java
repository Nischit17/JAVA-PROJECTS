import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");

        String name = in.nextLine();
        System.out.println(name);
    }
}

/*
Note:
        String name = in.next();
        Prints only first word.
*/