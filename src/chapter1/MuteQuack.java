package chapter1;

/**
 * Created by wangbinops on 2018/4/23.
 * 王斌
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会叫");
    }
}
