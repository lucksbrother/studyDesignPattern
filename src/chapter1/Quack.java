package chapter1;

/**
 * Created by wangbinops on 2018/4/23.
 * 王斌
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
