import java.util.UUID;

public class sbibank implements BankAccountInterface{
    private String password;
    private String name;
    private String accountNo;
    private double balance;
    final private Double rateOfInterest=5.0;
    final String IFSCCODE="SBIN0040788";

    public sbibank(String password, String name, double balance) {
        this.password = password;
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
    }

    public sbibank() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCODE() {
        return IFSCCODE;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "The account balance is "+this.balance;
        }
        return "passward incorrect";
    }

    @Override
    public String addMoney(Double amount) {
        this.balance+=amount;
        return "balance added successfully.uppdated balance is "+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(((this.balance)-1000)< amount){
    return "Cannot withdraw as minimum balance should be maintained";

            }
            else {
            this.balance -=amount;
            return "Withdraw successfull updated balance is"+this.balance;
            }
        }
        else return "passward incorrrect";
    }

    @Override
    public Double calculateInterest(int year) {
       return (balance*year*rateOfInterest)/100;
    }

    @Override
    public String changePassward(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "passward changed successfully";
        }
        else return"passward incorrect";

    }

    @Override
    public String toString() {
        return "sbibank{" +
                "password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCODE='" + IFSCCODE + '\'' +
                '}';
    }
}
