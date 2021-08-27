package com.processing;

public class Main {

    public static void main(String[] args) {
        Topping[] myToppings = new Topping[5];

        for (int i = 0; i < myToppings.length; i++) {
            myToppings[i] = new Topping(Topping.Type.PEPPERONI);
        }

        Pizza myPizza = new Pizza(
                new Crust(new Cheese(Cheese.Type.REGULAR)),
                new Cheese(Cheese.Type.EXTRA),
                new Sauce(Sauce.Color.RED),
                myToppings);

        Pizza yourPizza = new Pizza(myPizza);
        yourPizza.getCheese().setType(Cheese.Type.NONE);

        for (int i = 0; i < yourPizza.getToppings().length; i+=2) {
            yourPizza.getToppings()[i].setType(Topping.Type.OLIVE);
        }

        System.out.println("\nMY PIZZA: ");
        System.out.println(myPizza);
        System.out.println("\nYOUR PIZZA: ");
        System.out.println(yourPizza);
    }
}
