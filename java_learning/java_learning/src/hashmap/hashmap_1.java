package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashmap_1 {
    static void main() {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("name", "kaushal");
        dict.put("age", "17");

        System.out.println(dict);

        dict.put("name", "rahul");
        System.out.println(dict);
    }
}
