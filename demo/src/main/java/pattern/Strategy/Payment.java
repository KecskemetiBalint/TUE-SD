package pattern.Strategy;

//Abstract strategy
interface Payment {
    boolean processTransaction(Transaction transaction);

    double getTransactionFee(Transaction transaction);

    void printFees();
}
