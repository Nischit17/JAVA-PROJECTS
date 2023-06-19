import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;

        System.out.println("Enter x1 point");
        x1=in.nextInt();

        System.out.println("Enter y1 point");
        y1=in.nextInt();

        System.out.println("Enter x2point");
        x2=in.nextInt();

        System.out.println("Enter y2 point");
        y2=in.nextInt();

        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}