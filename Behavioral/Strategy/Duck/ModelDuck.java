package Behavioral.Strategy.Duck;

import Behavioral.Strategy.Duck.behaviors.FlyBehavior.FlyNoWay;
import Behavioral.Strategy.Duck.behaviors.QuackBehavior.Quack;


public class ModelDuck extends Duck{
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a mode duck");
  }
}
