import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BiodiversityRegistry {
    public static void main(String[] args) {
        HashMap<String, Integer> species = new HashMap<>();

        species.put("Lion", 25);
        species.put("Elephant", 40);
        species.put("Deer", 60);
        species.put("Wolf", 15);
        species.put("Eagle", 30);

        try {
            Scanner fileScanner = new Scanner(new File("sightings.txt"));

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine().trim();

                if (!name.isEmpty()) {
                    if (species.containsKey(name)) {
                        species.put(name, species.get(name) + 1);
                    } else {
                        species.put(name, 1);
                    }
                }
            }

            fileScanner.close();

            System.out.println("Species populations:");
            System.out.println(species);

        } catch (FileNotFoundException e) {
            System.out.println("Field report not found.");
        }
    }
}
