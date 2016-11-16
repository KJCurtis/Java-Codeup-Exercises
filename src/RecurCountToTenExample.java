/**
 * Created by KJCurtis on 11/15/16.
 */
public class RecurCountToTenExample {
        public static void main(String[] args) {
            recurToTen(1);
        }
        private static int recurToTen(int n) {
            if(n <= 10) {
                System.out.println(n);
                return recurToTen(n + 1);
            } else {
                return n;
            }
        }


}
