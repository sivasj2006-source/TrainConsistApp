import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison (Loop vs Stream) ===");

        // Create large dataset
        List<Bogie> bogieList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie("Sleeper", 50 + (i % 50)));
        }

        // 🔹 LOOP-BASED FILTERING
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 STREAM-BASED FILTERING
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Display results
        System.out.println("\nLoop Result Count: " + loopResult.size());
        System.out.println("Stream Result Count: " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        System.out.println("\nProgram continues...");
    }
}