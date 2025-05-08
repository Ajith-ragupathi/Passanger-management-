// US004 - Search Passenger by PRN
import java.util.Scanner;

public class SearchPassengerByPRN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        Passenger passenger1 = new Passenger("Ajith", "Kumar", "password123", "password123", "ajith@example.com", "9876543210", "Male", "Vandavasi");
        passenger1.prn = "PRN1234";
        Passenger passenger2 = new Passenger("John", "Doe", "password456", "password456", "john@example.com", "9876543211", "Male", "Chennai");
        passenger2.prn = "PRN5678";

        // Admin enters PRN to search
        System.out.print("Enter PRN to search: ");
        String prnSearch = scanner.nextLine();

        // Search and display the passenger details
        if (prnSearch.equals(passenger1.prn)) {
            System.out.println("\nPassenger Found:");
            passenger1.displayPassengerDetails();
        } else if (prnSearch.equals(passenger2.prn)) {
            System.out.println("\nPassenger Found:");
            passenger2.displayPassengerDetails();
        } else {
            System.out.println("Passenger not found with PRN: " + prnSearch);
        }
    }
}
