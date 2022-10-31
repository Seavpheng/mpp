package lab_5.prob2.quack;

import lab_5.prob2.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeaking");
    }
}
