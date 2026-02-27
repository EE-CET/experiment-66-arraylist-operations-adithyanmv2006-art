import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cart.add(sc.next());
        }

        String searchItem = sc.next();

        // Sort alphabetically
        Collections.sort(cart);

        // Print sorted list
        System.out.println("Sorted Items: " + cart);

        // Check if item exists
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}