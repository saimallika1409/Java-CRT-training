import java.util.Scanner;

public class ATMWithdrawl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount > 0 && amount % 100 == 0) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Error: Insufficient balance");
            }
        } else {
            System.out.println("Error: Invalid withdrawal amount");
        }
    }
}