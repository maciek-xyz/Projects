package Lesson8.Bank;

public class NonSufficientFundsException extends Exception {

    public NonSufficientFundsException(String message) {
        super(message);
    }
}
