package chapter2;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by wangbinops on 2018/5/8.
 * 王斌
 */
public class WechatNotify implements Observer, ConsumptionNotify {

    private Observable observable;

    private Float consumptionAmount;
    private String consumptionAddress;
    private Date consumptionDate;

    public WechatNotify(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //模拟邮件发送
        System.out.println("微信消息:" + consumptionDate + "时,您在" +consumptionAddress+"消费了"+consumptionAmount+"元人民币");
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
