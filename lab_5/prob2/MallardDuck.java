package lab_5.prob2;

import lab_5.prob2.Duck;
import lab_5.prob2.fly.FlyWithWings;
import lab_5.prob2.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    public void display(){

    }

}
