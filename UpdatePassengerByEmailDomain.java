// US005 - Update Passenger by Email Domain
import java.util.Scanner;

public class UpdatePassengerByEmailDomain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        Passenger passenger = new Passenger("Ajith", "Kumar", "password123", "password123", "ajith@example.com", "9876543210", "Male", "Vandavasi");

        // Display current details
        System.out.println("Current Passenger Details:");
        passenger.displayPassengerDetails();

        // Admin enters email domain to update
        System.out.print("Enter email domain to search for passengers (e.g., example.com): ");
        String emailDomain = scanner.nextLine();

        // Check if the domain matches
        if (passenger.email.contains(emailDomain)) {
            // Allow admin to update details
            System.out.print("Enter new first name: ");
            passenger.firstName = scanner.nextLine();
            System.out.print("Enter new last name: ");
            passenger.lastName = scanner.nextLine();
            System.out.print("Enter new city: ");
            passenger.city = scanner.nextLine();
            System.out.println("\nPassenger details updated successfully!");
            passenger.displayPassengerDetails();
        } else {
            System.out.println("No passengers found with the given email domain.");
        }
    }
}
