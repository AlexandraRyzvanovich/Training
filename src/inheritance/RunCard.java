package inheritance;

public class RunCard {
    public static void main(String[] args) {
        CardAction cd1 = new CardAction();
        CardAction cd2 = new CreditCardAction();
        //CreditCardAction cd3 = (CreditCardAction) new CardAction();
        CreditCardAction cd4 = new CreditCardAction();
        cd1.doPayment(5.0);
        cd1.result();
        cd2.doPayment(6.0);
        cd2.result();
        cd4.checkCreditLimit();
        cd4.doPayment(8);
        cd4.result();
        ((CreditCardAction)cd1).checkCreditLimit(); // ошибка времени выполнения
        ((CreditCardAction)cd2).checkCreditLimit(); // ок
    }
}
