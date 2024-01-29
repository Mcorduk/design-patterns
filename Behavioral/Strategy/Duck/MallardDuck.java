package Behavioral.Strategy.Duck;

import Behavioral.Strategy.Duck.behaviors.FlyBehavior.FlyWithWings;
import Behavioral.Strategy.Duck.behaviors.QuackBehavior.Quack;

public class MallardDuck extends Duck{
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  public void display(){
    System.out.println("I'm a real Mallard duck.");
  }
}
