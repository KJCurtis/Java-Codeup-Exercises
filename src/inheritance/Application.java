package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by KJCurtis on 12/1/16.
 */
public class Application {
    public static void main(String[] args) {
        Person luis = new Person("luis" , "Montealegre");
        Superhero superman = new Superhero("Clark", "Kent", "Superman", "He can Fly");

        List<Person> students = new ArrayList<>();
        students.add(luis);
        students.add(superman);


        printStudents((ArrayList<Person>) students);
    }


    public static void printStudents(ArrayList<Person> students) {
        for (Person student: students) {
            System.out.println(student.fullName());
        }
    }
    public void printSuperheroes(ArrayList<Superhero> superheroes) {
        for (Superhero superhero: superheroes) {
            System.out.println(superhero.alterEgo());
        }
    }
}
