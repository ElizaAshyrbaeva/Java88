import Helicopter.Helicopter;
import Java8.announcement.Announcement;
import Java8.devices.Laptop;
import Java8.devices.Phone;
import Java8.home.Home;
import Java8.transport.Airplane;
import Java8.transport.Car;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone","\uD83D\uDE0E",147000,"Amazing phone","14 PRO Max",256);
        Phone phone2 = new Phone("Samsung","\uD83E\uDD29",58000,"Great phone","S21",128);


        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D",129000,"Wonderful laptop","Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16",176000,"Productive laptop","Windows");

        Home home1 = new Home("Ihlas","\uD83C\uDFE2",3500000,"Great Home","Multi-storey",10);
        Home home2 = new Home("Chaos","\uD83C\uDFE0",15000000,"Amazing Home","House",25);


        Car car1 = new Car("Mercedes-Benz","\uD83D\uDE98",15000000,"Wonderful Car","Black", LocalDate.of(2010,3,6));
        Car car2 = new Car("BMW","\uD83D\uDE99",12000000,"Fast Car","Purple", LocalDate.of(2020,8,28));


        Airplane airplane1 = new Airplane("Supermarine Spitfire","\uD83D\uDEE9",125000000,"Fast Airplane","White", LocalDate.of(2015,1,14));
        Airplane airplane2 = new Airplane("Airbus A320","✈️",23000000,"Large Airplane","Blue", LocalDate.of(2004,11,16));


        Helicopter helicopter1 = new Helicopter("MD 500 Defender","\uD83D\uDE81",13500000,"Fast Helicopter","Brown",LocalDate.of(2012,12,23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache","\uD83D\uDE81",115000000,"Large Helicopter","Red",LocalDate.of(1999,7,9));


        Announcement[] announcements = {laptop1,laptop2,home1,home2,car2,car1,phone1,phone2,airplane1,airplane2,helicopter1,helicopter2};

        System.out.println(announcements[0].getClass().getName());

        while(true){
            System.out.println("1. Find Product By Price. 2. Find Product by Name. 3.Get the Cheapest Product \n" +
                    " 4.Get the most expensive product. 5.Get Product by Collection. ");
            System.out.print("Enter your option : ");
            int option = new Scanner(System.in).nextInt();
            if(option == 0) break;
            else if(option == 1){
                System.out.print("Enter product price : ");
                double price = new Scanner(System.in).nextDouble();
                Announcement.getProductByPrice(price,announcements);
            }else if(option == 2){
                System.out.println("Enter a product name : ");
                String name = new Scanner(System.in).nextLine();
                Announcement.findByName(name,announcements);
            } else if(option == 3) Announcement.getCheapestProduct(announcements);
            else if(option == 4) Announcement.getExpensiveProduct(announcements);
            else if(option == 5) {
                System.out.print("Enter a Collection Name : ");
                String collection = new Scanner(System.in).nextLine();
                Announcement.getProductsByCollection(collection,announcements);
            }
        }
    }

}