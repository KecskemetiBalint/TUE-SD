package pattern.Strategy;

public class Transaction {
    private final Account sender;
    private final Account receiver;
    private final double payment;
    private final String reference;
    private boolean valid = true;
    private boolean canBeUndone;

    public Transaction(Account sender, Account receiver, double payment, String reference, boolean canBeUndone) {
        this.sender = sender;
        this.receiver = receiver;
        if (payment > 0.0) {
            this.payment = payment;
        } else {
            throw new IllegalArgumentException("The payment must be larger than 0.0");
        }
        this.reference = reference;
        this.canBeUndone = canBeUndone;
    }

    boolean executeTransaction() {
        if (!this.sender.changeBalance(-payment)) {
            return false;
        }
        if (!this.receiver.changeBalance(payment)) {
            this.sender.changeBalance(payment);
            return false;
        }
        return true;
    }

    public Account getReceiver() {
        return receiver;
    }

    public double getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return String.format("Transfer of %f from account %d to account %d with reference %s",
                this.payment, this.sender.getID(), this.receiver.getID(), this.reference);
    }
}
