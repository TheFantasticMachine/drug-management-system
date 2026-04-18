import java.util.Dictionary;
import java.util.Hashtable;

public class Patient {
    // patient info
    String name, surname;
    int age, socialNumber;
    String[] allergies;

    Dictionary<String, Drug> medicationList = new Hashtable<>();
    Doctor curDoctor;

    // file info
    String filePath, fileName;

    public Patient(String name, String surname, int age, int socialNumber, Doctor doctor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.socialNumber = socialNumber;
        this.curDoctor = doctor;
    }

    // create user file
    public void create() {
        // creation process
    }

    // update user file
    public void updateRecord() {}

    // delete user file
    public void removeRecord() {}

    // add new drug
    public void addNewDrug() {}

    // remove a drug
    public void removeDrug() {}

    // assign new doctor
    public void assignNewDoctor() {}
}
