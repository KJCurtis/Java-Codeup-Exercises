/**
 * Created by KJCurtis on 11/14/16.d
 */
public class ctrl_stmnts_loops_exercise {
    public static void main(String[] args) {
        int[] numbersByFive = {5,10,15,20,25,30};
        int countToFifteen = 0;
        System.out.println("while loop print from five to fifteen \n");
        while (countToFifteen <= 15) {
            if (countToFifteen < 5) {
                countToFifteen = 5;
            }
            System.out.println(countToFifteen);
            countToFifteen++;
        }


        System.out.println("for loop through array by five \n");
        for (int i = 0; i < numbersByFive.length; i++) {
            System.out.println(numbersByFive[i]);
        }


    }
}
