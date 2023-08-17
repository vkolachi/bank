// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
               sbibank vivekAcc=new sbibank("vivek123","vivek",10000);
                System.out.println(vivekAcc);
                System.out.println(vivekAcc.fetchBalance("visek123"));
                System.out.println(vivekAcc.fetchBalance("vivek123"));
                System.out.println(vivekAcc.addMoney(1222.0));
                System.out.println(vivekAcc.withdrawMoney(100.0,"viswa"));
                System.out.println(vivekAcc.withdrawMoney(100.0,"vivek123"));
        System.out.println(vivekAcc.calculateInterest(12));
        System.out.println(vivekAcc.changePassward("vivek123","vivek111"));
        }
    }
