package student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Question03 {

    private static final String FILE_NAME = "Student.dat";

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Shams", 25));
        studentList.add(new Student("Sohel", 26));
        studentList.add(new Student("Shiplu", 29));
        studentList.add(new Student("Sadik", 20));

        writeStudentToFile(studentList);
        readStudentFromFile();
    }

    public static void writeStudentToFile(List<Student> studentList) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for (Student student : studentList) {
                oos.writeObject(student);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readStudentFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            while (true) {
                try {
                    Student student = (Student) ois.readObject();
                    System.out.println(student);
                } catch (EOFException e) {
                    break;
                }
            }
            ois.close();

        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
