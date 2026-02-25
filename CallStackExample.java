public class CallStackExample {

    public static void D() {
        System.out.println("In method D");
    }

    public static void C() {
        System.out.println("In method C");
        D();
    }

    public static void B() {
        System.out.println("In method B");
        C();
    }

    public static void A() {
        System.out.println("In method A");
        B();
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        A();
        System.out.println("End");
    }
}