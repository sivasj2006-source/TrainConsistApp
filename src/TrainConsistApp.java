import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Array of Bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG150", "BG320", "BG275"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                System.out.println("Bogie ID found at position: " + i);
                found = true;
                break; // early termination
            }
        }

        // If not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nProgram continues...");
    }
}