
class Laptop {
    String brand;
    String model;
    double price;
    int ramSize;
    
    public Laptop() {
        this.brand = "Unknown";
        this.model = "Generic Model";
        this.price = 0.0;
        this.ramSize = 4;
    }

    Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0; 
        this.ramSize = 4; 
    }

    public Laptop(String brand, String model, double price, int ramSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
    }

    public void displayDetails() {
        System.out.println("\nLaptop Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

