package chapter2;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author wangbinops
 * @date 2018/5/7
 * 王斌
 */
public class SMSNotify implements Observer, ConsumptionNotify {

    private Observable observable;

    private Float consumptionAmount;
    private String consumptionAddress;
    private Date consumptionDate;

    public SMSNotify(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("短信消息:" + consumptionDate + "时,您在" +consumptionAddress+"消费了"+consumptionAmount+"元人民币");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof BankMessage) {
            BankMessage bankMessage = (BankMessage) o;
            this.consumptionAmount = bankMessage.getConsumptionAmount();
            this.consumptionAddress = bankMessage.getConsumptionAddress();
            this.consumptionDate = bankMessage.getConsumptionDate();
            display();
        }
    }
}
