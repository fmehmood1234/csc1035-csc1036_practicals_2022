public class HelloWorld {
    
    public static void main(String[] args) {

        System.out.println("Farheen Mehmood\nCSC1035 Programming Portfolio 2\nHello World");
        addition(); //ignore for now
        fancyPrint(); // ignore for now

        System.out.println();

        System.out.println(-22 + 3 * 2);
        System.out.println((9/2) % 9);
        System.out.println(2147483646 + -15 / 2);
        System.out.println((-2147483646 + -1000/ 2) * 10);

        System.out.println();

        int x = 250;
        int y = 72;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y);
    }//end main
    
    public static void addition() {
        int x = 100;
        int y = 50;
        int z =  x + y;
        System.out.println(z);
    }//end addition
    
    public static void fancyPrint() {
        System.out.println("J       a   v     v  a");
        System.out.println("J      a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        System.out.println();

        System.out.println("   C    S   C     1  0   3   5 ");
        System.out.println("   CS   C    10   35");
        System.out.println("C C CSC     103   5");
        System.out.println(" CS    C    1 0     3     5");

    }//end fancyPrint
}