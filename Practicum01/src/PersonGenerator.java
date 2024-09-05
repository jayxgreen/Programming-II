import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<String> folks = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean doneInput = false;
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        String personRec = "";

        int YOB = 0;

        // uses a fixed known path:
        //  Path file = Paths.get("c:\\My Documents\\data.txt");

        // use the toolkit to get the current working directory of the IDE
        // will create the file within the Netbeans project src folder
        // (may need to adjust for other IDE)
        // Not sure if the toolkit is thread safe...
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "112233");

        do
        {
            ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits]: ");
            firstName = SafeInput.getNonZeroLenString(in, "Enter the first name: ");
            lastName = SafeInput.getNonZeroLenString(in, "Enter the last name:");
            title = SafeInput.getNonZeroLenString(in, "Enter the title:");
            YOB = SafeInput.getRangedInt(in, "Enter the year of birth:", 1000, 9999);

            personRec = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
            folks.add(personRec);

            doneInput = SafeInput.getYNConfirm(in, "Are you done?");

        }while(!doneInput);

        // File Path
        String filePath = "PersonData.txt";


        try {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            String[] recs = new String[0];
            for (String rec : recs) {
                writer.write(rec, 0, rec.length());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line

            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
