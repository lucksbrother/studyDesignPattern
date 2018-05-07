package chapter2;

import java.util.Date;

/**
 *
 * @author wangbinops
 * @date 2018/5/7
 * 王斌
 */
public class TestMain {

    public static void main(String[] args) {
        BankMessage data = new BankMessage();

        SMSNotify smsNotify = new SMSNotify(data);
        MailNotify mailNotify = new MailNotify(data);
        WechatNotify wechatNotify = new WechatNotify(data);

        data.setConsumptionAction(5.5F, "超市", new Date());
        data.setConsumptionAction(15.5F, "餐厅", new Date());
        data.deleteObserver(mailNotify);
        data.setConsumptionAction(55.5F, "旅店", new Date());

    }
}
