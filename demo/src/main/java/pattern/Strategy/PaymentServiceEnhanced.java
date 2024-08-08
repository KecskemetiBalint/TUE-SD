package pattern.Strategy;

public class PaymentServiceEnhanced {
    private final AppPayment appPayment = new AppPayment();
    private final BankTransferPayment bankTransferPayment = new BankTransferPayment();
    private final CreditCardPayment creditCardPayment = new CreditCardPayment();

    public void pay(Transaction transaction, Strategy strategy) {
        switch (strategy) {
            case AppPayment -> appPayment.processTransaction(transaction);
            case BankTransferPayment -> bankTransferPayment.processTransaction(transaction);
            case CreditCardPayment -> creditCardPayment.processTransaction(transaction);
            default -> throw new IllegalStateException("Selected payment method is not defined.");
        }
    }
}
