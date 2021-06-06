package com.demo.all;



public class Customer {
    String name;
    String type;
    String size;
    private Clothing[] items = new Clothing[5];

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1: case 2: case 3: size = "S"; break;
            case 4: case 5: case 6: size = "M"; break;
            case 7: case 8: case 9: size = "L"; break;
            default: size = "X";
        }
    }

    public void addItems(Clothing[] newClothing) {
        this.items = newClothing;
    }

    public Clothing[] getItems() {
        return this.items;
    }

    public double getTotalClothingCost() {
        double total= 0.0;
        for(Clothing item: items) {
            total = total + item.getPrice();
        }
        return total;
    }

    public void averagePrice(Clothing[] items) {
        int totalPrice = 0;
        int averagePrice = 0;
        int count = 0;
        for(Clothing item: items) {
            if (item.getSize().equals("L")) {
                count ++;
                totalPrice += item.getPrice();
            }
        }
        try {
            averagePrice = totalPrice / count;
            System.out.println("Average price " + averagePrice + " " + "totalPrice"  +totalPrice+ " "+ "count" + count );
        }
        catch (ArithmeticException e) {
            System.out.println("Do not divide by 0");
        }
    }
}
