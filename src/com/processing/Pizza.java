package com.processing;

import java.util.Arrays;

public class Pizza {
    private Crust crust;
    private Cheese cheese;
    private Sauce sauce;
    private Topping[] toppings;

    public Pizza(Crust crust, Cheese cheese, Sauce sauce, Topping[] toppings) {
        this.crust = crust;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Pizza(Pizza pizza) {
        // Shallow copies - points to same addresses
        //this.crust = pizza.getCrust();
        //this.cheese = pizza.getCheese();
        //this.sauce = pizza.getSauce();
        //this.toppings = pizza.getToppings();

        // Deep copies - uses their own addresses
        this.crust = new Crust(new Cheese(pizza.getCrust().getCheese().getType())); // Need new on both variables
        this.cheese = new Cheese(pizza.getCheese().getType());
        this.sauce = new Sauce(pizza.getSauce().getColor());

        Topping[] originalToppings = pizza.getToppings();
        this.toppings = new Topping[originalToppings.length];
        for (int i = 0; i < toppings.length; i++) {
            toppings[i] = new Topping(originalToppings[0].getType());
        }
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    public void setToppings(Topping[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "crust=" + crust +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}
