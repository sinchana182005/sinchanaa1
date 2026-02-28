package MemberInnerClass;

public class BankAccount {
    private double balance = 10000;
    class Transaction {
        void withdraw(double amount){
            if(amount<=balance){
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        }else {
            System.out.println("Insufficient Funds");
        }
    }
}
public static void main (String [] args) {
    BankAccount account = new BankAccount();
    BankAccount.Transaction tx = account.new Transaction();
    tx.withdraw(3000);
    tx.withdraw(2000);
    System.out.println(account.balance);

}
}

/* Points to remember
Transaction belongs to specific account
direct access to private variable balance
clean encapsulation


 */