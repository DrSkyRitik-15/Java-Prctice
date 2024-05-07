import java.util.*;
 class A {
    private int value;

    public A(int value) {
        this.value = value;
    }
}
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a1: ");
        int a_1 = sc.nextInt();

        System.out.print("a2: ");
        int a_2 = sc.nextInt();

        System.out.print("a3: ");
        int a_3 = sc.nextInt();

        A al = new A(a_1);
        A a2 = new A(a_2);
        A a3 = new A(a_3);

        System.out.println("al.equals(a2): " + al.equals(a2));
        System.out.println("al.equals(a3): " + al.equals(a3));
    }
}
