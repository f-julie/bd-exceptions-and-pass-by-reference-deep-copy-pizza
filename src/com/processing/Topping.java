package com.processing;

public class Topping {
    public enum Type {
        PEPPERONI,
        MUSHROOM,
        OLIVE
    }

    private Type type;

    public Topping(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type=" + type +
                '}';
    }
}
