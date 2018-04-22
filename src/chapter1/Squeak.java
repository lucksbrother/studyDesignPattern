package chapter1;

/**
 * Created by wangbinops on 2018/4/23.
 * 王斌
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
