import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

// Main class
public class TrainConsistApp {

    // 🔹 Bubble Sort Method
    public static void bubbleSort(List<Bogie> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j).capacity > list.get(j + 1).capacity) {
                    // Swap
                    Bogie temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort Bogies by Capacity ===");

        // Create bogie list
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));

        // Apply Bubble Sort
        bubbleSort(bogieList);

        // Display sorted list
        System.out.println("\nSorted Bogies (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}