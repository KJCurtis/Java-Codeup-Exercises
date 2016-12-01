package inheritance;

/**
 * Created by KJCurtis on 12/1/16.
 */
public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }


}
