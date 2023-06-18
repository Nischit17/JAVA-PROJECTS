import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();

        for (int num = 1; num <= n ; num++) {
            System.out.println(num + " ");

        }
    }
}

/*
WHILE LOOP ( 1 - 5 NUMBERS )

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = 1;

        while(num <= 5) {
        System.out.println(num);
        num += 1;
        }
    }
}

 */