package question3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Question3 {

    private static final String FILE_NAME = "student.dat";

    public static void main(String[] args) {
        List<StudentInfo> studentList = new ArrayList<>();

        studentList.add(new StudentInfo("Shamima", 28));
        studentList.add(new StudentInfo("Adiba", 20));
        studentList.add(new StudentInfo("Afifa", 16));
        studentList.add(new StudentInfo("Mitu", 30));
        
        writeStudentToFile(studentList);
        readStudentFromFile();

    }

    public static void writeStudentToFile(List<StudentInfo> studentList) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (StudentInfo student : studentList) {
                oos.writeObject(student);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error writing to file. " + e.getMessage());
        }
    }

    public static void readStudentFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            while (true) {
                try {
                    StudentInfo student = (StudentInfo) ois.readObject();
                    System.out.println(student);
                } catch (Exception e) {
                    break;
                }
            }
            ois.close();

        } catch (Exception e) {
            System.out.println("Error reading the file." + e.getMessage());

        }
    }
}
