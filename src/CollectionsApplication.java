/**
 * Created by KJCurtis on 11/28/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionsApplication {
    public static void main(String[] args) {


        HashMap map = new HashMap();
        map.put("luis", 30);
        map.put("Kenny", 21);
        map.put("Ryan", 34);
        map.put("Josh", 32);
        map.put("Mike", 25);

        map.forEach((key, value) -> {
            System.out.println("Key is: " + key);
            System.out.println("value is: " + value);
        });






        List names = new ArrayList();
        // List<string> onlyStrings = new ArrayList<>();         *how to specify use of a certain data type only
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
