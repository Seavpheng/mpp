package lab_5.prob2;

import lab_5.prob2.fly.FlyNoWay;
import lab_5.prob2.quack.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {

    }
}
