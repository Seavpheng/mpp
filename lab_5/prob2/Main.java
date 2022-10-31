package lab_5.prob2;

import lab_5.prob2.fly.FlyNoWay;
import lab_5.prob2.fly.FlyWithWings;
import lab_5.prob2.quack.MuteQuack;
import lab_5.prob2.quack.Quack;

public class Main {
    public static void main(String[] agr){

        Duck[] ducks={new MallardDuck(), new DecoyDuck(), new RedheadDuck() ,  new RubberDuck()};

        for(Duck d: ducks){
           System.out.println( d.getClass().getSimpleName());
            d.display();
            d.performFly();
            d.performQuack();
            d.swim();
        }
    }
}
