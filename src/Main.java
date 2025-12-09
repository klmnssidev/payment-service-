import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      Student S1 = new Student("jason", 24, 89 );
      Student S2 = new Student("katti", 25, 67 );
      Student S3 = new Student("larry", 18, 50 );
      Student S4 = new Student();
      Student[] Students = new Student[10];
//      Students[0] = S1;
//      Students[1] = S2;
//      Students[2] = S3;
//      Students[3] = S4;

        System.out.println("inter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("inter your age: ");
        int age = sc.nextInt();
        System.out.println("inter your GPA: ");
        double Gpa = sc.nextDouble();
        Student newStudent = new Student(name, age, (int) Gpa);

        // Insert into first empty place
        for (int i = 0; i < Students.length; i++) {
            if (Students[i] == null) {
                Students[i] = newStudent;
                System.out.println("Student " + i + " has been created");
                break;
            }
        }
        for (Student std : Students) {
            boolean pass = std.getGpa() >= 50;
            System.out.println("Name: " + std.getName() + ", age: "  + std.getAge() + ", Gpa: " + std.getGpa() + ", pass: " + pass);
        }
//        System.out.println(Students[0]);
    }
}
