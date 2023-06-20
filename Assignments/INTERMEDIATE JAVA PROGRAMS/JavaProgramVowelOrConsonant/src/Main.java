import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0;
        System.out.println("Enter a character : ");
        char ch=in.next( ).charAt(0);
        //char ch=sc.nextChar();
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}