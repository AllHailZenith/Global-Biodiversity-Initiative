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
                    species.put(name, species.getOrDefault(name, 0) + 1);
                }
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Field report not found.");
        }

        if (species.isEmpty()) {
            System.out.println("No species found.");
            return;
        }

        String mostFrequentSpecies = "";
        String leastFrequentSpecies = "";

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (String name : species.keySet()) {
            int count = species.get(name);

            if (count > maxCount) {
                maxCount = count;
                mostFrequentSpecies = name;
            }

            if (count < minCount) {
                minCount = count;
                leastFrequentSpecies = name;
            }
        }

        System.out.println("Species populations:");
        System.out.println(species);

        System.out.println("Most frequent: " +
                mostFrequentSpecies + " - " + maxCount);

        System.out.println("Least frequent: " +
                leastFrequentSpecies + " - " + minCount);
    }
}
