import java.util.*;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Bogie class with validation
class Bogie {
    String name;
    int capacity;

    // Constructor with validation
    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

// 🔹 Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC14: Handle Invalid Bogie Capacity ===");

        List<Bogie> bogieList = new ArrayList<>();

        try {
            // Valid bogie
            bogieList.add(new Bogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogieList.add(new Bogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues safely...");
    }
}