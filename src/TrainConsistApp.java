import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs
        System.out.println("\nAdding Bogie IDs...");

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");

        // Attempt to add duplicate IDs
        bogieIds.add("B2"); // duplicate
        bogieIds.add("B1"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}