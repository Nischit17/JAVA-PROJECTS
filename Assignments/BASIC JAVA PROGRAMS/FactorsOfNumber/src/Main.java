public class Main {
    public static void main(String[] args) {

        int number = 60;
        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
Factors of negative number.

public class Main {
    public static void main(String[] args) {
        int number = -60;
        System.out.print("Factors of " + number + " are: ");

        for(int i = number; i <= Math.abs(number); ++i) {
            if(i == 0) {
                continue;
            }
            else {
                if (number % i == 0) {
                    System.out.print(i + " ");
    }
}
*/