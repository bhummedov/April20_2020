package HashTreeEx;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashTreeEX {
        public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Vahit",100);
        tree.put("Shohrat",100);
        tree.put("Rumeyse",100);
        tree.put("Melih",100);
        tree.put("Ali",100);
    //System.out.println(ht);
    Set<String> keys = tree.keySet();
    Iterator<String> iter = keys.iterator();
    String key;
        while (iter.hasNext()) {
        key = iter.next();
        System.out.println(key + " = " + tree.get(key));
    }
}
}
