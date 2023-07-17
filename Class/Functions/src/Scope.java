public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "NIScHIT";
        {
//            int a=78; already initialized outside the block in the same method, hence we cannot initialize again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "RAHUL";
            System.out.println(name);


            // values initialized in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block

//        scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a =10000;

        }
        System.out.println(a);

    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
