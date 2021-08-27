package com.processing;

public class Crust {
    private Cheese cheese;

    public Crust(Cheese cheese) {
        this.cheese = cheese;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Crust{" +
                "cheese=" + cheese +
                '}';
    }
}
