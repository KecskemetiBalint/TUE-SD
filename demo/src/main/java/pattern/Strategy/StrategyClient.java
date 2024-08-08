package pattern.Strategy;

public class StrategyClient {
    
    public static void run() {
        Account a = new Account("A", 200.00);
        Account b = new Account("B", 150.00);
        Transaction t1 = new Transaction(a, b, 20.50, "Train ticket", true);
        Transaction t2 = new Transaction(b, a, 10.75, "Food", false);
        
        BankTransferPayment pay1 = new BankTransferPayment();
        CreditCardPayment pay2 = new CreditCardPayment();
    
        PaymentServiceSettingStrategy service1 = new PaymentServiceSettingStrategy(pay1);
    
        System.out.println(t1.toString());
        service1.pay(t1);
        service1.setPaymentStrategy(pay2);
        System.out.println(t2.toString());
        service1.pay(t2);
        pay1.printFees();
        pay2.printFees();       


        //EnhancedTest
        PaymentServiceEnhanced enhancedService = new PaymentServiceEnhanced();
        enhancedService.pay(t1, Strategy.BankTransferPayment);
    }
}
