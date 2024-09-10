import java.util.Scanner;

public class SafeInputObjTest {
    public static void main(String[] args) {
        SafeInputObj safeInput = new SafeInputObj();

        // Test getNonZeroLenString
        String name = safeInput.getNonZeroLenString("Enter your name");
        System.out.println("Name entered: " + name);

        // Test getRangedInt
        int age = safeInput.getRangedInt("Enter your age", 0, 120);
        System.out.println("Age entered: " + age);

        // Test getInt
        int number = safeInput.getInt("Enter any integer");
        System.out.println("Integer entered: " + number);

        // Test getRangedDouble
        double price = safeInput.getRangedDouble("Enter a price", 0, 1000);
        System.out.println("Price entered: " + price);

        // Test getDouble
        double measurement = safeInput.getDouble("Enter a measurement");
        System.out.println("Measurement entered: " + measurement);

        // Test getYNConfirm
        boolean confirm = safeInput.getYNConfirm("Do you want to continue?");
        System.out.println("Confirmation: " + (confirm ? "Yes" : "No"));

        // Test getRegExString
        String zipCode = safeInput.getRegExString("Enter a 5-digit zip code", "^\\d{5}$");
        System.out.println("Zip code entered: " + zipCode);

        System.out.println("All tests completed.");
    }
}
