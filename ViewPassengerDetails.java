// US003 - View Passenger Details
import java.util.ArrayList;
import java.util.List;

public class ViewPassengerDetails {

    static List<Passenger> passengerList = new ArrayList<>();

    public static void main(String[] args) {
        // Sample data for passengers
        passengerList.add(new Passenger("Ajith", "Kumar", "password123", "password123", "ajith@example.com", "9876543210", "Male", "Vandavasi"));
        passengerList.add(new Passenger("John", "Doe", "password456", "password456", "john@example.com", "9876543211", "Male", "Chennai"));

        // Display all passengers
        System.out.println("List of All Registered Passengers:");
        for (Passenger passenger : passengerList) {
            passenger.displayPassengerDetails();
            System.out.println("---------------------------------------------------");
        }
    }
}
