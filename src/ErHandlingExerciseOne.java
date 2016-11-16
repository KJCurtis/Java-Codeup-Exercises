/**
 * Created by KJCurtis on 11/15/16.
 * dont worry about retrieving a student or storing them in an array
 * get the student name
 * get the students age as an int
 * get why the student wants to learn programming
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class ErHandlingExerciseOne {
    public static void main(String[] args) {
        String studentName;
        int studentAge;
        String studentReason;
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        studentName = askStudenForName(input);

        //wishful thinking
        studentAge = toFindAge(input);

        studentReason = askStudentForReason(input);




        System.out.println("Student Name is: " + studentName);
        System.out.println("Student Age is: " + studentAge);
        System.out.println("Student Reason is: " + studentReason);
        input.close(); //closing the data stream or the scanner obj so we dont waste memory when we are done with it
    }
    public static int toFindAge(Scanner input) {
        try {
            System.out.println("What is your age");
            int studentAge = input.nextInt();
            if (studentAge < 0) {
                throw new IllegalArgumentException("Age must be a positive integer number");
            }
            return studentAge;
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("Invalid age, Age must be an integer number");
            return toFindAge(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return toFindAge(input);
        }
    }

    public static String askStudenForName(Scanner input) {
        try {
            System.out.println("What's your name");
            String studentName = input.next();
            if (studentName.trim().isEmpty()) {
                throw new IllegalArgumentException("your name must not be empty");
            }
            return studentName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudenForName(input);
        }
    }
    public static String askStudentForReason(Scanner input) {
        try {
            System.out.println("Why do you want to learn to program");
            String studentReason = input.next();
            if (studentReason.trim().isEmpty()) {
                throw new IllegalArgumentException("your reason must not be empty");
            }
            return studentReason;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askStudentForReason(input);
        }
    }

}
