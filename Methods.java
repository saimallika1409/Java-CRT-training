class Greetings {
    public void hello() {
        System.out.println("Hello");
    }
}

public class Methods {
    public static void main(String[] args) {
        System.out.println("in main method");
        Greetings greet = new Greetings();
        greet.hello();
    }
}