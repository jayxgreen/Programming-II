import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path of the Person file:");

        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("The file does not exist or is not a valid file.");
            return;
        }

        try {
            Scanner fileScanner = new Scanner(file);

            // Print the header
            System.out.println(String.format("%-10s %-15s %-15s %-10s %-5s", "ID#", "Firstname", "Lastname", "Title", "YOB"));
            System.out.println("==============================================================");

            // Read the file and print the formatted data
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+");
                if (parts.length >= 5) {
                    String id = parts[0];
                    String firstName = parts[1];
                    String lastName = parts[2];
                    String title = parts[3];
                    String yob = parts[4];

                    System.out.println(String.format("%-10s %-15s %-15s %-10s %-5s", id, firstName, lastName, title, yob));
                } else {
                    System.out.println("Invalid data format in the file.");
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}