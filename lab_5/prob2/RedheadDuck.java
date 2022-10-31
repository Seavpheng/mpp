package lab_5.prob2;

import lab_5.prob2.fly.FlyWithWings;
import lab_5.prob2.quack.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display(){
        System.out.println("  Displaying");
    }

}
