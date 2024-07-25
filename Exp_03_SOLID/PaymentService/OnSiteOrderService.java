package PaymentService;

public class OnSiteOrderService implements OrderService {
    @Override
    public void orderPayment(int foodPrice){
        System.out.println("on-site Payment with Price : " + foodPrice + " $");
    }

    @Override
    public void orderRegister(String customerName){
        System.out.println("on-site order registered for " + customerName);
    }
}