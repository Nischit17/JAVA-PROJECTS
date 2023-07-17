import java.util.Arrays;

public class VArArgs {
    public static void main(String[] args) {
        fun();
        multiple(2,3,"NISCHIT D S");
    }

    static void multiple(int a,int b, String ...v)  {


    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));

    }
}
