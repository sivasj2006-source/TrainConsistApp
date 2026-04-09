import java.util.*;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for easy display
    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));

        // Sort using Comparator (ascending order)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nSorted Bogies (by Capacity):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}