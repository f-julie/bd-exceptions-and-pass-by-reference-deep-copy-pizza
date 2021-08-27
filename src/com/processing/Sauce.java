package com.processing;

public class Sauce {
    public enum Color {
        RED,
        WHITE
    }

    private Color color;

    public Sauce(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "color=" + color +
                '}';
    }
}
