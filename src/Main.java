public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "world";

        System.out.println(hello + " " + world+"!");
    }

    public static void main3(String[] args) {
        int a=1;
        int b=2;
        System.out.println("a > b = "+ (a>b));
        System.out.println("a < b = "+ (a<b));
    }

    public static void main2(String[] args) {
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println("sum = "+ c);
    }

    public static void main1(String[] args) {
        int i=1;
        System.out.println(i);
        i = i+1;
        System.out.println(i);
        i = i+1;
        System.out.println(i);
        System.out.println("Hello world!");
    }
}
