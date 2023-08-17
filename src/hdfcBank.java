import java.util.UUID;

public class hdfcBank implements BankAccountInterface{


    private String name;
    private String accountNo;//UNIQUE UUID
    private String password;
    private double balance;
   final private double rateOfInterest=7.1;
   final String IFSCCODE="HDFC123223";

    public hdfcBank(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo=String.valueOf(UUID.randomUUID());
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCODE() {
        return IFSCCODE;
    }

    public hdfcBank() {
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password))
            return "your balance is "+this.balance;

        return "your password is not correct";
    }

    @Override
    public String addMoney(Double amount) {
        this.balance+=amount;
        return "amount added successfully,your new balace is"+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance<amount){

                return "insufficiant balace";
            }
            else{
                this.balance -=amount;
                return "balance deducted successfully.updated balance is "+this.balance;
            }

        }



        return "your password is not correct";
    }

    @Override
    public Double calculateInterest(int year) {
        return (this.balance*year*rateOfInterest)/100.0;
    }

    @Override
    public String changePassward(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "passward updated successfully";
        }
        else
            return "Old passward incorrect";
    }

    @Override
    public String toString() {
        return "hdfcBank{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCODE='" + IFSCCODE + '\'' +
                '}';
    }
}
