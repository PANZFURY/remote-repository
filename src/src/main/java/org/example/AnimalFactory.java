package org.example;

public class AnimalFactory {
    static Animal createFactory(String type) {
        return switch (type) {
          case "dog" -> new Dog();
          case "cat" -> new Cat();
            default -> null;
        };
    }
}
