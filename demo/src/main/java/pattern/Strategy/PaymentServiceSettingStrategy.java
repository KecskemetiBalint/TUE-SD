package pattern.Strategy;

//Context
public class PaymentServiceSettingStrategy {
        private Payment paymentStrategy;

    public PaymentServiceSettingStrategy(Payment strategy) {
        this.paymentStrategy = strategy;
    }

    public void setPaymentStrategy(Payment strategy) {
        this.paymentStrategy = strategy;
    }

    public void pay(Transaction transaction) {
        this.paymentStrategy.processTransaction(transaction);
    }
}