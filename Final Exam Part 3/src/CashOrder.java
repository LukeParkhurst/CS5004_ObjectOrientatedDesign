
public class CashOrder implements Payment {

  @Override
  public void acceptPurchase(Order order) {
    order.changePaymentMethod(this);
  }

}

