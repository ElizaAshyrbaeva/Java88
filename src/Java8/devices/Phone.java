package Java8.devices;

import Java8.announcement.Announcement;

public class Phone extends Announcement {
    private String product;
    private int memory;


    public Phone(String name, String image, double price, String description, String product, int memory) {
        super(name, image, price, description);
        this.product=product;
        this.memory=memory;




    }



}
