import java.util.*;

public class TrainConsistApp {

    // 🔹 Search Method with validation
    public static int searchBogie(List<String> bogieIds, String key) {

        // Defensive check (Fail-Fast)
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available for search!");
        }

        // Linear search logic
        for (int i = 0; i < bogieIds.size(); i++) {
            if (bogieIds.get(i).equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search ===");

        List<String> bogieIds = new ArrayList<>();
        // Try commenting this line to test exception
        // bogieIds.add("BG101");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            int result = searchBogie(bogieIds, key);

            if (result != -1) {
                System.out.println("Bogie found at position: " + result);
            } else {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}