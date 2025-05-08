// US006 - Delete Passenger by Mobile Number
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DeletePassengerByMobile {

    static List<Passenger> passengerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample data
        passengerList.add(new Passenger("Ajith", "Kumar", "password123", "password123", "ajith@example.com", "9876543210", "Male", "Vandavasi"));
        passengerList.add(new Passenger("John", "Doe", "password456", "password456", "john@example.com", "9876543211", "Male", "Chennai"));

        // Admin enters mobile number to delete
        System.out.print("Enter Mobile Number to delete: ");
        String mobileToDelete = scanner.nextLine();

        boolean found = false;

        for (Passenger passenger : passengerList) {
            if (passenger.mobileNumber.equals(mobileToDelete)) {
                passengerList.remove(passenger);
                System.out.println("Passenger with Mobile Number " + mobileToDelete + " has been deleted.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No passenger found with the provided mobile number.");
        }
    }
}
