package Lesson8.Bank;

public class ReachedCreditLimitException extends Exception {

    public ReachedCreditLimitException(String message) {
        super(message);
    }
}
