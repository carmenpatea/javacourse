package duke.choice;

import java.util.Arrays;

public class Clothing implements Comparable<Clothing> {
    String description;
    double price;
    String size = "M";

    public final static int MIN_PRICE = 10;
    public final static double MIN_TAX = 0.2;

    public Clothing(String description, double price, String newSize) {
        this.description = description;
        this.price = price;
        size = newSize;
    }

    public Clothing(String description, String size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + price*MIN_TAX;
    }

    public void setPrice(double price) {
       /* if ( price >= MIN_PRICE) {
            this.price = price;
        }*/
        this.price= (( price >= MIN_PRICE) ? price : MIN_PRICE );
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "Clothing:" +
                "description='" + description + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Clothing clothing) {
        return this.description.compareTo(clothing.description);
    }
}
