package pattern.Command;

public class Waiter{

    public void getOrder(){
        System.out.println("The waiter has recieved the order");
    }

    public void deliverOrder(){
        System.out.println("The waiter has delivered the order");
    }

    public void revertGetOrder(){
        System.out.println("The waiter has reverted the recieved the order");
    }

    public void revertDeliverOrder(){
        System.out.println("The waiter has reverted the delivered the order");
    }
}