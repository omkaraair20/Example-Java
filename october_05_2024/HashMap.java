import java.util.Map;
import java.util.Scanner;

class Car {
    private String name;
    private double average;
    private double perMileCost;
    private double price;

    public Car(String name, double average, double perMileCost, double price) {
        this.name = name;
        this.average = average;
        this.perMileCost = perMileCost;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public double getPerMileCost() {
        return perMileCost;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car Name: " + name + ", Average: " + average + " km/l, Cost per Mile: $" + perMileCost + ", Price: $" + price;
    }
}

public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<String, Car> carMap = new java.util.HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Sedan:");
        System.out.print("Name: ");
        String sedanName = scanner.nextLine();
        System.out.print("Average mileage (km/l): ");
        double sedanAverage = scanner.nextDouble();
        System.out.print("Cost per mile ($): ");
        double sedanPerMileCost = scanner.nextDouble();
        System.out.print("Price ($): ");
        double sedanPrice = scanner.nextDouble();
        scanner.nextLine();

        carMap.put("Sedan", new Car(sedanName, sedanAverage, sedanPerMileCost, sedanPrice));

        System.out.println("\nEnter details for Hatchback:");
        System.out.print("Name: ");
        String hatchbackName = scanner.nextLine();
        System.out.print("Average mileage (km/l): ");
        double hatchbackAverage = scanner.nextDouble();
        System.out.print("Cost per mile ($): ");
        double hatchbackPerMileCost = scanner.nextDouble();
        System.out.print("Price ($): ");
        double hatchbackPrice = scanner.nextDouble();
        scanner.nextLine();

        carMap.put("Hatchback", new Car(hatchbackName, hatchbackAverage, hatchbackPerMileCost, hatchbackPrice));

        System.out.println("\nEnter details for MUV:");
        System.out.print("Name: ");
        String muvName = scanner.nextLine();
        System.out.print("Average mileage (km/l): ");
        double muvAverage = scanner.nextDouble();
        System.out.print("Cost per mile ($): ");
        double muvPerMileCost = scanner.nextDouble();
        System.out.print("Price ($): ");
        double muvPrice = scanner.nextDouble();

        carMap.put("MUV", new Car(muvName, muvAverage, muvPerMileCost, muvPrice));
        System.out.println("\nCar Features:");

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            String carType = entry.getKey();
            Car carDetails = entry.getValue();
            System.out.println(carType + ": " + carDetails);
        }

        scanner.close();
    }
}