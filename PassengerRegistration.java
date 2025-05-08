// US002 - Passenger Registration
import java.util.Scanner;

class Passenger {
    String firstName;
    String lastName;
    String password;
    String confirmPassword;
    String email;
    String mobileNumber;
    String gender;
    String city;
    String prn;

    // Constructor to initialize passenger details
    public Passenger(String firstName, String lastName, String password, String confirmPassword, String email, String mobileNumber, String gender, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.city = city;
        this.prn = generatePRN();
    }

    // Method to generate unique PRN
    private String generatePRN() {
        return "PRN" + (int)(Math.random() * 10000);  // Generate random PRN for the passenger
    }

    // Display passenger details
    public void displayPassengerDetails() {
        System.out.println("Passenger PRN: " + this.prn);
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Mobile: " + this.mobileNumber);
        System.out.println("Gender: " + this.gender);
        System.out.println("City: " + this.city);
    }
}

public class PassengerRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Passenger Registration");
        
        // Get details from user
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        System.out.print("Confirm Password: ");
        String confirmPassword = scanner.nextLine();
        
        System.out.print("Enter Email ID: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        
        System.out.print("Enter Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        
        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please try again.");
            return;
        }

        // Create a new passenger object
        Passenger passenger = new Passenger(firstName, lastName, password, confirmPassword, email, mobileNumber, gender, city);
        
        // Display passenger details
        System.out.println("\nPassenger Registered Successfully!");
        passenger.displayPassengerDetails();
    }
}
