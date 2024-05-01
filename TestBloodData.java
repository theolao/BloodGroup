import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default constructor
        BloodData defaultBloodData = new BloodData();
        System.out.println("Default Blood Data:");
        displayBloodData(defaultBloodData);


        // User prompts
        System.out.println("Enter blood type (O, A, B, AB):");
        BloodType bloodType = BloodType.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter Rh factor (POSITIVE or NEGATIVE):");
        RhFactor rhFactor = RhFactor.valueOf(scanner.nextLine().toUpperCase());
        BloodData userBloodData = new BloodData(bloodType, rhFactor);
        System.out.println("User Blood Data:");
        displayBloodData(userBloodData);

        defaultBloodData.setBloodType(bloodType);
        defaultBloodData.setRhFactor(rhFactor);
        System.out.println("Updated Default Blood Data:");
        displayBloodData(defaultBloodData);
    }

    private static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}