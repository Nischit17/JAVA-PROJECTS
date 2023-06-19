import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, a=0;
        System.out.print("ENTER A NUMBER: ");
        num = in.nextInt();

        while(num!=0){
            System.out.print("ENTER A NUMBER: ");
            num = in.nextInt();
            System.out.println("ENTER 0 TO END LOOP");
            if(num>a){
                a = num; //
            }
        }
        System.out.print("The largest number entered by the user is: "+a);
    }
}