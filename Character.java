import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z') {
            System.out.println("lower case");
        }
        else{
            System.out.println("not lower case");
        }
    }

}