package chapter1;

/**
 * Created by wangbinops on 2018/4/23.
 * 王斌
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
