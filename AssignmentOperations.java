import java.util.Scanner;

class AssignmentOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Initial values:");
        System.out.println("a = " + a + ", b = " + b);

        a += b;
        System.out.println("After a += b : a = " + a);

        a -= b;
        System.out.println("After a -= b : a = " + a);

        a *= b;
        System.out.println("After a *= b : a = " + a);

        a /= b;
        System.out.println("After a /= b : a = " + a);

        a %= b;
        System.out.println("After a %= b : a = " + a);
    }
}
