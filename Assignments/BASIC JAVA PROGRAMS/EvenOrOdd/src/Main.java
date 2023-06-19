import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        if( num %2 == 0)
            System.out.println(num + " is even ");
        else
            System.out.println(num + " is odd ");
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        String EvenOdd = ( num%2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + EvenOdd );
    }
}