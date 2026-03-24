import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies (insertion order maintained)
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate bogie
        train.add("Sleeper"); // Duplicate - will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nBogie count (unique): " + train.size());

        System.out.println("\nSystem ensures:");
        System.out.println("- No duplicate bogies");
        System.out.println("- Original insertion order preserved");
    }
}