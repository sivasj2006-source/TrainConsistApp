import java.util.*;

public class TrainConsistApp {

    // 🔹 Binary Search Method
    public static int binarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return mid; // found
            } else if (result < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // 🔹 Sorted array (IMPORTANT)
        String[] bogieIds = {"BG101", "BG150", "BG205", "BG275", "BG320"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Call binary search
        int index = binarySearch(bogieIds, key);

        // Display result
        if (index != -1) {
            System.out.println("Bogie ID found at position: " + index);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nProgram continues...");
    }
}