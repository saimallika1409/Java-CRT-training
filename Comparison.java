public class Comparison {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 4;

        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is greater");
            }
        } else {
            if (b > c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        }
    }
}
