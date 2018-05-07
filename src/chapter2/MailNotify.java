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
public class MailNotify implements Observer, ConsumptionNotify {
    private Observable observable;

    private Float consumptionAmount;
    private String consumptionAddress;
    private Date consumptionDate;

    public MailNotify(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //模拟邮件发送
        System.out.println("邮件消息:" + consumptionDate + "时,您在" +consumptionAddress+"消费了"+consumptionAmount+"元人民币");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof BankMessage) {
            BankMessage bankMessage = (BankMessage) o;
            //可自定义通知条件：达到10元以上才启用邮件形式
            if (bankMessage.getConsumptionAmount() > 10) {
                this.consumptionAmount = bankMessage.getConsumptionAmount();
                this.consumptionAddress = bankMessage.getConsumptionAddress();
                this.consumptionDate = bankMessage.getConsumptionDate();
                display();
            }
        }
    }
}
