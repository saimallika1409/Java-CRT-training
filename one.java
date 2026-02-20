import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        System.out.println("hello world");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);

        float b = sc.nextFloat();
        System.out.println(b);

        double c = sc.nextDouble();
        System.out.println(c);

        sc.nextLine(); 

        String d = sc.nextLine();
        System.out.println(d);
        int b = sc.nextInt();
        System.out.println("the value of b is "+b);

        sc.close();
    }
}
