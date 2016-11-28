/**
 * Created by KJCurtis on 11/28/16.
 */
import java.util.ArrayList;
import java.util.List;

public class CollectionsApplication {
    public static void main(String[] args) {
        List names = new ArrayList();

        System.out.println(names.isEmpty());
        names.add("Kenny");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        names.add("Ryan");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        for (int i = 0; i < names.size(); i++ ) {
            System.out.println(names.get(i));
        }

        for (Object name: names ) {
            System.out.println(name);
        }
    }
}
