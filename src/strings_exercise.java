/**
 * Created by KJCurtis on 11/14/16.
 */
public class strings_exercise {
    public static void main(String[] args) {
        String message = "We don't need no ";
        int i = 0;
        while (i < 2) {
            if (i > 2) {
                break;
            } else if (i == 0) {
                System.out.printf(message + "education \n");
            } else {
                System.out.printf(message + "thought control");
            }
            i++;
        }
        System.out.println("check \"this\" out!");
        System.out.printf("In windows, the main drive is usually C:\\\n");
        System.out.printf("I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!\n");
        //exercise class review





        System.out.println("\n Pig latin Exercise: \n");

        /*
        Take in user input
        prompt the user if they would like to translate the string
        convert to lowercase
        split the string by ' ' to an array
        for loop through
        if a word starts with a vowel add 'way' to the ending
        if a word starts with a consonant move the consonants before the first vowel to the end then add 'ay' to the end
        treat 'y' as a consonant

         */

    }
}
