import java.util.UUID;

class Bank{
    private final String uuid = UUID.randomUUID().toString();
    private String accountType;
    private Double amountOfCash;
    public Bank(){};
    public Bank(String accountType, Double amountOfCash){
        this.amountOfCash = amountOfCash;
        this.accountType = accountType;
    }
    public void deposit(Double amountOfCashToDeposit){
        this.amountOfCash =
                (this.amountOfCash == null?0D : this.amountOfCash)
                        + amountOfCashToDeposit;
    }
    public void withdraw(Double amountOfCashToWithdraw){
        if(this.amountOfCash < amountOfCashToWithdraw){
            System.out.println("Your balance is lower than amount you withdraw");
        }else {
            this.amountOfCash -= amountOfCashToWithdraw;
        }
    }
    public void showBalance(){
        System.out.println(STR."Your \{this.accountType} account remains: " + this.amountOfCash);
    }
}
public class AccountBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Account Saving",20D);
        bank.deposit(1000D);
        bank.showBalance();
        bank.withdraw(500D);
        bank.showBalance();
        System.out.println();
        Bank CreditCardAccount = new Bank("Credit Card",50D);
        CreditCardAccount.withdraw(30D);
        CreditCardAccount.showBalance();
    }
}
