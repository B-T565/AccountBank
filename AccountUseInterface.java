import static java.lang.StringTemplate.STR;

class Account implements FunctionalType{
    private String accountType;
    private Double amountOfCash;
    public Account(){};
    public Account(String accountType, Double amountOfCash){
        this.accountType = accountType;
        this.amountOfCash = amountOfCash;
    }

    @Override
    public void deposit(Double amountOfCashToDeposit) {
        this.amountOfCash =
                (this.amountOfCash == null? 0D: this.amountOfCash)
                        +amountOfCashToDeposit;
    }

    @Override
    public void withdraw(Double amountOfCashToWithDraw) {
        this.amountOfCash -= amountOfCashToWithDraw;
    }

    @Override
    public void showBalance() {
        System.out.println(STR."Your \{this.accountType} account is : " + this.amountOfCash);
    }
}
public class AccountUseInterface {
    public static void main(String[] args) {
        FunctionalType savingAccount = new Account("Saving",4D);
        savingAccount.showBalance();
        savingAccount.deposit(50D);
        savingAccount.showBalance();
        System.out.println();
        FunctionalType CreditCardAccount = new Account("Credit Card Account", 10D);
        CreditCardAccount.showBalance();
        CreditCardAccount.withdraw(5D);
        CreditCardAccount.showBalance();
    }
}
