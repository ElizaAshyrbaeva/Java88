package Helicopter;

import Java8.transport.Car;

import java.time.LocalDate;

public class Helicopter extends Car {

    public Helicopter(String name, String image, double price, String description, String colour, LocalDate yearOfIssue) {
        super(name, image, price, description, colour, yearOfIssue);
    }
}
