
/**
 * Created by KJCurtis on 11/28/16.
 */



















/*
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StudentScoreComparison {
    //main contains procedural code
    public static void main(String[] args) {
        //prompt for input
        //sort alphabetically
        System.out.println("welcome to the Student archive");
        GetStudentInfo();


    }



    public static void GetStudentInfo() {
        Scanner input = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int score = 0;
        ArrayList <Student> students = new ArrayList<>();

        try {
            System.out.println("Please input the student's first name: ");
            firstName = input.nextLine();
            System.out.println("Please input the student's last name: ");
            lastName = input.nextLine();
            System.out.println("Please input the student's score: ");
            score = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("your input type is incorrect!");
            GetStudentInfo();
        }
        Student newStudent = new Student(firstName, lastName, score);
        students.add(newStudent);
        for (Student student: students) {
            System.out.println("Student added: " + student.firstName + " " + student.lastName + "  Score: " + student.score);
        }
        for (Student student: students) {
            System.out.println("Student added: " + student.firstName + " " + student.lastName + "  Score: " + student.score);
        }
        promptToAddAnotherStudent(students);


    }



    public static void promptToAddAnotherStudent(ArrayList students) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("would you like to add another student? (Y/N): ");
            char toGetAnother = sc.next().trim().toLowerCase().charAt(0);
            if (toGetAnother == 'y') {
                GetStudentInfo();
            } else if (toGetAnother == 'n') {
                System.out.println("continuing!");
            } else {
                System.out.println(toGetAnother);
                throw new InputMismatchException("Input must either be 'y' or 'n'");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            promptToAddAnotherStudent(students);
        }
    }
}
*/