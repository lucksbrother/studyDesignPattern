package chapter1;

/**
 * Created by wangbinops on 2018/4/23.
 * 王斌
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

}
