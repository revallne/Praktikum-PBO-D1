public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super("Minimum balance required: $100.0");
      }    
    
}
