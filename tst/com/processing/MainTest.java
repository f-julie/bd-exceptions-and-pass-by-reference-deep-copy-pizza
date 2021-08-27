package com.processing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
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

        assertEquals(Cheese.Type.EXTRA, myPizza.getCheese().getType());
        assertEquals(Cheese.Type.NONE, yourPizza.getCheese().getType());

        for (int i = 0; i < yourPizza.getToppings().length; i++) {
            assertEquals(Topping.Type.PEPPERONI, myPizza.getToppings()[i].getType());
        }

        for (int i = 0; i < yourPizza.getToppings().length; i++) {
            if (i % 2 == 0) {
                assertEquals(Topping.Type.OLIVE, yourPizza.getToppings()[i].getType());
            } else {
                assertEquals(Topping.Type.PEPPERONI, yourPizza.getToppings()[i].getType());
            }
        }
    }
}