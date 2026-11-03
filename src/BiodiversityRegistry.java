import java.util.HashMap;
import java.util.Scanner;

public class BiodiversityRegistry {
    public static void main(String[] args) {
        HashMap<String, Integer> species = new HashMap<>();

        species.put("Lion", 25);
        species.put("Elephant", 40);
        species.put("Deer", 60);
        species.put("Wolf", 15);
        species.put("Eagle", 30);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a species name: ");
        String name = input.nextLine();

        if (species.containsKey(name)) {
            System.out.println("Population: " + species.get(name));
        } else {
            System.out.println("Species is not currently in the registry.");
        }

        input.close();
    }
}
