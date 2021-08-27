package com.processing;

public class Cheese {
    public enum Type {
        NONE,
        REGULAR,
        EXTRA
    }

    private Type type;

    public Cheese(Type type) {
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
        return "Cheese{" +
                "type=" + type +
                '}';
    }
}
