package Java8.transport;

import Java8.announcement.Announcement;

import java.time.LocalDate;

public class Airplane extends Car {


    public Airplane(String name, String image, double price, String description, String colour, LocalDate yearOfIssue) {
        super(name, image, price, description, colour, yearOfIssue);
    }
}

