package Lesson8.Bank.restricted;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionHistory {
    private BigDecimal balanceBefore;
    private List<TransactionLog> transactions;

    public TransactionHistory(BigDecimal balanceBefore) {
        this.balanceBefore = balanceBefore;
        this.transactions = new ArrayList<>();
    }

    public void addNewTransaction(TransactionType transactionType, LocalDateTime date, BigDecimal currentBalance){
        TransactionLog newLog = new TransactionLog();
        newLog.setTransactionType(transactionType.getName());
        newLog.setDate(date);
        newLog.setAccountBefore(balanceBefore);
        newLog.setAccountBefore(currentBalance);

        balanceBefore = currentBalance;
        transactions.add(newLog);
    }

    public void getTransactionFromRange(LocalDateTime from, LocalDateTime to){
        List<TransactionLog> logs = transactions.stream().filter(t -> (from == null && to == null)
                || (from != null && t.getDate().isAfter(from))
                || (to != null && t.getDate().isBefore(to))).collect(Collectors.toList());

        logs.forEach(System.out::println);
    }
}
