import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class ShortList {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        ArrayList<String> words = new ArrayList<>();

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] lineWords = line.split("\\s+");
                    for (String word : lineWords) {
                        words.add(word);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Filter shortWordFilter = new ShortWordFilter();
        System.out.println("Short words (length < 5):");
        for (String word : words) {
            if (shortWordFilter.accept(word)) {
                System.out.println(word);
            }
        }
    }
}