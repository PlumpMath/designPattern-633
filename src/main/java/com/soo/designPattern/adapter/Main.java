package com.soo.designPattern.adapter;

/**
 * Created by soo on 2016. 9. 24..
 */
public class Main {

  public static void main(String[] args) {

    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The turkey says..");
    turkey.gobble();
    turkey.fly();

    System.out.println("The Duck says..");
    testDuck(duck);

    System.out.println("The TurkeyAdapter says..");
    testDuck(turkeyAdapter);
  }

  public static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }

}
