import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Add bogies (CREATE)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion (READ)
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Remove a bogie (DELETE)
        bogies.remove("AC Chair");

        System.out.println("\nBogies after removal of AC Chair:");
        System.out.println(bogies);

        // Check existence (SEARCH)
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal bogie list:");
        System.out.println(bogies);

        System.out.println("\nSystem ready for next operations...");
    }
}