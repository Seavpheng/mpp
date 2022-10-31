package lab_5.prob2;

import lab_5.prob2.fly.FlyNoWay;
import lab_5.prob2.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        setFlyBehavior( new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    @Override
    public void display(){
        System.out.println("  displaying");
    }
}
