public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this(0, 0, new BloodData());
    }

    public Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }
    public void notifyForRareBloodType() {
        if (this.bloodData.isRareBloodType()) {
            System.out.println("Notification: Your blood type (AB) is very rare. Consider donating blood!");
        }
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }
}