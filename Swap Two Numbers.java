public class Main {
    public static void main(String[] args) {
        /* How do you swap two numbers without using a third variable in Java? */

        // late A=10 & B=20
        int a=10, b=20;

        System.out.println("A="+a+" & B="+b);
        a=a+b;
        b=a-b;
        a=a-b;

        // Now A=20 & B=10
        System.out.println("After Swapping A="+a+" & B="+b);

    }
}