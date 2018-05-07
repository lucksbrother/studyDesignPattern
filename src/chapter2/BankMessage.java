package chapter2;

import java.util.Date;
import java.util.Observable;

/**
 * Created by wangbinops on 2018/5/3.
 * 王斌
 */
public class BankMessage extends Observable {

    private Float consumptionAmount;
    private String consumptionAddress;
    private Date consumptionDate;

    public BankMessage() {
    }

    public void ConsumptionNotify() {
        setChanged();
        notifyObservers(this);
    }

    public void setConsumptionAction(Float consumptionAmount,String consumptionAddress,Date consumptionDate){
        this.consumptionAddress = consumptionAddress;
        this.consumptionAmount = consumptionAmount;
        this.consumptionDate = consumptionDate;
        ConsumptionNotify();
    }

    public Float getConsumptionAmount() {
        return consumptionAmount;
    }

    public String getConsumptionAddress() {
        return consumptionAddress;
    }

    public Date getConsumptionDate() {
        return consumptionDate;
    }

}
