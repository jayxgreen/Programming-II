import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileUtils {

    // Reads the contents of a file and returns it as a String
    public static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Loads stop words from a file into a Set
    public static Set<String> loadStopWords(String stopWordsFilePath) {
        Set<String> stopWords = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(stopWordsFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stopWords.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle error properly in your app
        }
        return stopWords;
    }

    // Saves tag frequencies to a file
    public static void saveTags(File file, Map<String, Integer> tagFrequency) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, Integer> entry : tagFrequency.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        }
    }
}