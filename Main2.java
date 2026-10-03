import java.util.Scanner;

public class Main2 {

    // Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter morning water usage (litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (litres): ");
        int evening = scanner.nextInt();

        // Calling the method
        int totalConsumption = calculateTotal(morning, evening);

        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        scanner.close();
    }
}