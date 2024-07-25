package PaymentService;

public class PhoneOrderService implements OrderService {
    @Override
    public void orderPayment(int foodPrice){
        System.out.println("Phone Payment with Price : " + foodPrice + " Tomans!");
    }

    @Override
    public void orderRegister(String customerName){
        System.out.println("on-site order registered for " + customerName);
    }
}