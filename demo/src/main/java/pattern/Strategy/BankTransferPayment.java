package pattern.Strategy;

//Strategy B
public class BankTransferPayment implements Payment {
    @Override
    public boolean processTransaction(Transaction transaction) {
        if (transaction.executeTransaction()) {
            return true;
        }
        return false;
    }

    @Override
    public double getTransactionFee(Transaction transaction) {
        return 0.0;
    }

    @Override
    public void printFees() {
        System.out.println("No fees are collected for bank transfer.");
    }
}
