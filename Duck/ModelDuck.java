package Duck;

import Duck.behaviors.FlyBehavior.FlyNoWay;
import Duck.behaviors.QuackBehavior.Quack;


public class ModelDuck extends Duck{
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a mode duck");
  }
}
