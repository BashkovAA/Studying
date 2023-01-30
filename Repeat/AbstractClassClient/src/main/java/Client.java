import java.util.Scanner;

public abstract class Client {
    double amount = 0.0;

    double getAmount() {
        return amount;
    }
    double put(double putAmount) {
        if (putAmount >= 0) {
            amount += putAmount;
        }
        return amount;
    }
    double take(double takeAmount) {
        if (takeAmount >= 0 && takeAmount <= amount) {
            amount -= takeAmount;
        }
        return amount;
    }
}
