// Admin Menu - Main Menu
import java.util.Scanner;

public class AdminMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Passenger Registration");
            System.out.println("2. View Passenger Details");
            System.out.println("3. Search Passenger by PRN");
            System.out.println("4. Update Passengers by Email Domain");
            System.out.println("5. Delete Passengers by Mobile Number");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Handle user choices
            switch (choice) {
                case 1:
                    new PassengerRegistration().main(null);
                    break;
                case 2:
                    new ViewPassengerDetails().main(null);
                    break;
                case 3:
                    new SearchPassengerByPRN().main(null);
                    break;
                case 4:
                    new UpdatePassengerByEmailDomain().main(null);
                    break;
                case 5:
                    new DeletePassengerByMobile().main(null);
                    break;
                case 6:
                    System.out.println("Good Bye Administrator!! Terminating the Program.");
                    break;
                default:
                    System.out.println("You have selected an inappropriate option. Kindly select an appropriate option.");
            }
        } while (choice != 6);
    }
}
