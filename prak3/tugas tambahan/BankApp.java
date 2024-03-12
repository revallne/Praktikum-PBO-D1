public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.withdraw(200.0);
            //account.withdraw(450.0);
            System.out.println("Saldo saat ini: $"+account.getBalance());
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
      }

}
