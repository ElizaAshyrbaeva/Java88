package Java8.announcement;

import Helicopter.Helicopter;
import Java8.devices.Laptop;
import Java8.devices.Phone;
import Java8.home.Home;
import Java8.transport.Airplane;
import Java8.transport.Car;

import java.util.Arrays;
import java.util.Comparator;

public class Announcement {
    private static String name;
    private String image;
    private double price;
    private String description;

    public Announcement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public  static  void  findByName(String name,Announcement []announcements){
        for (Announcement announcement:announcements) {
            if(announcement.getName().equals(name)){
                System.out.println(announcement);

            }
        }

    }
    public static void getCheapestProduct(Announcement[] announcements){
        Arrays.sort(announcements,new Comparator<Announcement>() {
            @Override
            public int compare(Announcement a1, Announcement a2) {
                if(a1.getPrice() != a2.getPrice())
                    return (int)a1.getPrice() - (int)a2.getPrice();
                return a1.getName().compareTo(a2.getName());
            }
        });
        System.out.println(announcements[0]);
    }

    public static void getExpensiveProduct(Announcement[] announcements){
        Arrays.sort(announcements,new Comparator<Announcement>() {
            @Override
            public int compare(Announcement a1, Announcement a2) {
                if(a1.getPrice() != a2.getPrice())
                    return (int)a1.getPrice() - (int)a2.getPrice();
                return a1.getName().compareTo(a2.getName());
            }
        });

        System.out.println(announcements[announcements.length - 1]);
    }

    public static void getProductByPrice(double price,Announcement[] announcements){
        for (Announcement announcement : announcements) {
            if(announcement.getPrice() == price) System.out.println(announcement);
        }
    }

    public static void getProductsByCollection(String collection,Announcement[] announcements){
        for (Announcement announcement : announcements){
            if(collection.equals("Laptop") && announcement instanceof Laptop) System.out.println(announcement);
            else if(collection.equals("Phone") && announcement instanceof Phone) System.out.println(announcement);
            else if(collection.equals("Home") && announcement instanceof Home) System.out.println(announcement);
            else if(collection.equals("Helicopter") && announcement instanceof Helicopter) System.out.println(announcement);
            else if(collection.equals("Airplane") && announcement instanceof Airplane) System.out.println(announcement);
            else if(collection.equals("Car") && announcement instanceof Car) System.out.println(announcement);
        }
    }
    public String toString() {
        return "Product Name : " + name + "\n" +
                "Product Image : " + image + "\n" +
                "Product Price : " + price + "\n" +
                "Product Description : " + description + "\n";
    }
}
