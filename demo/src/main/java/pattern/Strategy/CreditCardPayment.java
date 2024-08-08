package pattern.Strategy;

//Strategy A
public class CreditCardPayment implements Payment {
    private final Account creditCardCompany = new Account("CCC", 0.0);

    @Override
    public boolean processTransaction(Transaction transaction) {
        Account receiver = transaction.getReceiver();
        Transaction fees = new Transaction(receiver, creditCardCompany, getTransactionFee(transaction), "Credit card fees", false);
        if (transaction.executeTransaction()) {
            fees.executeTransaction();
            return true;
        }
        return false;
    }

    @Override
    public double getTransactionFee(Transaction transaction) {
        return transaction.getPayment() * 0.02;
    }

    @Override
    public void printFees() {
        System.out.println("Creditcardfee");
    }
}
