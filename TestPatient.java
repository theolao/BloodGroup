import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // displays default patient details
        Patient defaultPatient = new Patient();
        System.out.println("Default Patient:");
        displayPatientDetails(defaultPatient);

        // Creates patient details
        System.out.println("Enter details for a new patient:");
        Patient userPatient = createUserPatient(scanner);
        System.out.println("User Patient:");
        displayPatientDetails(userPatient);

        System.out.println("Enter ID and age for a patient with default blood data:");
        Patient defaultBloodPatient = createDefaultBloodPatient(scanner);
        System.out.println("Patient with Default Blood Data:");
        displayPatientDetails(defaultBloodPatient);
    }

    private static Patient createUserPatient(Scanner scanner) {
        System.out.println("Enter patient ID number:");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter patient age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter blood type (O, A, B, AB):");
        BloodType bloodType = BloodType.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter Rh factor (POSITIVE or NEGATIVE):");
        RhFactor rhFactor = RhFactor.valueOf(scanner.nextLine().toUpperCase());
        BloodData bloodData = new BloodData(bloodType, rhFactor);
        return new Patient(idNumber, age, bloodData);
    }

    private static Patient createDefaultBloodPatient(Scanner scanner) {
        System.out.println("Enter patient ID number:");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter patient age:");
        int age = Integer.parseInt(scanner.nextLine());
        return new Patient(idNumber, age, new BloodData());
    }

    private static void displayPatientDetails(Patient patient) {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data:");
        displayBloodData(patient.getBloodData());
        patient.notifyForRareBloodType();
    }

    private static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}