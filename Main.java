public class Main{
public static void main(String[] args) {
    BankAccount user = new BankAccount(23.00,21.00);
    user.getTotalMoney();
    user.checkingAccountWithdraw(12);
    System.out.println(user.getcheckingBalance());
    System.out.println(BankAccount.allTheMoney());
    System.out.println(BankAccount.accountNumber());

    BankAccount brandon = new BankAccount(5000, 5000);
    brandon.getTotalMoney();
    System.out.println(BankAccount.accountNumber());
    System.out.println(BankAccount.allTheMoney());
    }
}