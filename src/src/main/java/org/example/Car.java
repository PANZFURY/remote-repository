package org.example;

public class Car {
    private String color;
    private int maxSpeed;
    private String type;

    private Car(Builder b) {
        this.color = b.color;
        this.maxSpeed = b.maxSpeed;
        this.type = b.type;
    }

    static class Builder {
        private String color;
        private int maxSpeed;
        private String type;

        Builder setColor(String color) {
            this.color = color;
            return this;
        }

        Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        Builder setType(String type) {
            this.type = type;
            return this;
        }

        Car build() {
            return new Car(this);
        }
    }
}
