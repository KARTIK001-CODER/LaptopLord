import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many inputs do you want to provide (0, 2, or 4)? ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        Laptop laptop;

        if (choice == 0) {
            laptop = new Laptop();
        } else if (choice == 2) {
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter Model: ");
            String model = sc.nextLine();
            laptop = new Laptop(brand, model);
        } else if (choice == 4) {
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter Model: ");
            String model = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter RAM Size (GB): ");
            int ram = sc.nextInt();
            laptop = new Laptop(brand, model, price, ram);
        } else {
            System.out.println("Invalid choice! Creating default laptop.");
            laptop = new Laptop();
        }

        laptop.displayDetails();

        sc.close();
    }
}