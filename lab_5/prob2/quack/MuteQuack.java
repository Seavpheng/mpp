package lab_5.prob2.quack;

import lab_5.prob2.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("Silence");
    }
}
