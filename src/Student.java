/**
 * Created by KJCurtis on 11/28/16.
 *
 * student class is the blueprint for student objects
 * each student obj represents an actual student
 *
 */

package students;

public class Student {
    public String firstName;
    public String lastName;
    public int score;

    Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

}
