public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numberOfBankAccounts = 0;
    private static double moneyStored = 0;
    public BankAccount(double checkingBalance,double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        numberOfBankAccounts++;
        moneyStored += checkingBalance + savingBalance;
    }

    public static int accountNumber(){
        return numberOfBankAccounts;
    }

    public double getcheckingBalance(){
        return checkingBalance;
    }

    public void getTotalMoney(){
        System.out.println(this.checkingBalance + this.savingBalance);
    }

    public double getsavingBalance(){
        return savingBalance;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }

    public void checkingAccountDeposit(double checkingAccountDeposit){
        this.checkingBalance += checkingAccountDeposit;
        moneyStored += checkingAccountDeposit;
    }

    public void savingAccountDeposit(double savingAccountDeposit){
        this.savingBalance += savingAccountDeposit;
        moneyStored += savingAccountDeposit;
    }
    
    public void checkingAccountWithdraw(double checkingAccountWithdraw){
        if(checkingBalance < checkingAccountWithdraw){
            System.out.println("insufficient funds");
        }else{
            this.checkingBalance -= checkingAccountWithdraw;
            moneyStored -= checkingAccountWithdraw;
        }
    }

    public void savingAccountWithdraw(double savingAccountWithdraw){
        if(savingBalance < savingAccountWithdraw){
            System.out.println("insufficient funds");
        }else{
            this.savingBalance -= savingAccountWithdraw;
            moneyStored -= savingAccountWithdraw;
        }
    }
    
    public static double allTheMoney(){
        return moneyStored;
    } 





















}

