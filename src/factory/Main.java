package factory;

import factory.abstraction.factory.AbstractDrinkFactory;
import factory.abstraction.factory.AmericaDrinkFactory;
import factory.abstraction.factory.ChinaDrinkFactory;
import factory.method.factory.AmericaCoffeeFactory;
import factory.method.factory.ChinaCoffeeFactory;
import factory.method.factory.ICoffeeFactory;
import factory.simple.OperationFactory;
import factory.simple.operation.Operation;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class Main {
    public static void main(String[] args) {
        testSimpleFactory();
        testMethodFactory();
        testAbstractFactory();
    }


    private static void testSimpleFactory() {
        Operation operation = OperationFactory.createOperation("+");
        operation.num1 = 1;
        operation.num2 = 2;
        System.out.println(operation.result());


        operation = OperationFactory.createOperation("-");
        operation.num1 = 1;
        operation.num2 = 2;
        System.out.println(operation.result());
    }

    private static void testMethodFactory() {
        ICoffeeFactory coffeeFactory = new AmericaCoffeeFactory();
        coffeeFactory.makeCoffee();

        coffeeFactory = new ChinaCoffeeFactory();
        coffeeFactory.makeCoffee();
    }

    private static void testAbstractFactory() {
        AbstractDrinkFactory drinkFactory = new AmericaDrinkFactory();
        drinkFactory.createCoffee();
        drinkFactory.createTea();

        drinkFactory = new ChinaDrinkFactory();
        drinkFactory.createCoffee();
        drinkFactory.createTea();
    }
}
