import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Alphabetically ===");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}