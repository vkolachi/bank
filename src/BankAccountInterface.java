public interface BankAccountInterface {
    String fetchBalance(String password);
    String addMoney(Double amount);
    String withdrawMoney(double amount,String password);
    Double calculateInterest(int year);
    String changePassward(String oldPassword,String newPassword);
}
