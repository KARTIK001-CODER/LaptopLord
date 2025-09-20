import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Laptop Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Laptop Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Laptop Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter RAM Size (in GB): ");
        int ramSize = sc.nextInt();

        // Creating Laptop object with user input
        Laptop laptop = new Laptop(brand, model, price, ramSize);

        // Displaying laptop details
        laptop.displayDetails();

        sc.close();
    }
}
