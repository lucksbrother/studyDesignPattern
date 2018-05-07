package chapter2;

import java.util.Date;
import java.util.Observable;

/**
 * Created by wangbinops on 2018/5/3.
 * 王斌
 */
class BankMessage extends Observable {

    private Float consumptionAmount;
    private String consumptionAddress;
    private Date consumptionDate;

    private void consumptionNotify() {
        setChanged();
        notifyObservers(this);
    }

    void setConsumptionAction(Float consumptionAmount, String consumptionAddress, Date consumptionDate){
        this.consumptionAddress = consumptionAddress;
        this.consumptionAmount = consumptionAmount;
        this.consumptionDate = consumptionDate;
        consumptionNotify();
    }

    Float getConsumptionAmount() {
        return consumptionAmount;
    }

    String getConsumptionAddress() {
        return consumptionAddress;
    }

    Date getConsumptionDate() {
        return consumptionDate;
    }

}
