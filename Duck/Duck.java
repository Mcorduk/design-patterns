package Duck;

import Duck.behaviors.FlyBehavior.FlyBehavior;
import Duck.behaviors.QuackBehavior.QuackBehavior;

public abstract class Duck {
  // Declare two reference variables for the behaviour interface types.
  // All duck subclasses(in the same package) inherit these.
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck(){

  }

  public abstract void display();

  public void setFlyBehavior (FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior (QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void performFly(){
    //Delegate to the behaviour class
    flyBehavior.fly();
  }
  public void performQuack(){
    //Delegate to the behaviour class
    quackBehavior.quack();
  }

  public void swim(){
    System.out.println("All ducks float, even decoys!");
  }
}

