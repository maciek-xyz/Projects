package Lesson8.Bank.restricted;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLog {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private LocalDateTime date;
    private String transactionType;
    private BigDecimal accountBefore;
    private BigDecimal accountAfter;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAccountBefore(BigDecimal accountBefore) {
        this.accountBefore = accountBefore;
    }

    public void setAccountAfter(BigDecimal accountAfter) {
        this.accountAfter = accountAfter;
    }

    @Override
    public String toString() {
        return "TransactionLog{" +
                "date=" + date +
                ", transactionType='" + transactionType + '\'' +
                ", accountBefore=" + accountBefore +
                ", accountAfter=" + accountAfter +
                '}';
    }
}
