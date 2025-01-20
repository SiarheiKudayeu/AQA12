package main.java.lesson8.collections;

import java.util.*;

public class MapClassExample {

    public static void main(String[] args) {
        //HashMap не гарантирует порядка
        System.out.println("HashMap");
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        System.out.println(hashMap);

        //LinkedHashMap сохраняет порядка
        System.out.println("LinkedHashMap");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);

        //TreeMap упорядочивает по клучу
        System.out.println("TreeMap");
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        System.out.println(treeMap);


        //for
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println("Key= " + entry.getKey() + " : " + "Value= " + entry.getValue());
        }

        //get Value by Key
        System.out.println(getValueByKey(hashMap, 61));

        //Set of keys
        System.out.println("Set ok keys");
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);

        //Collection of values
        System.out.println("Collection of values");
        Collection<String> values = hashMap.values();
        System.out.println(values);
    }

    public static void fillMap(Map<Integer, String> map) {
        map.put(1, "Sam");
        map.put(3, "Anna");
        map.put(6, "Arnold");
        map.put(22, "Misha");
        map.put(61, "Sasha");
        map.put(7, "Ruslan");
        map.put(15, "Yana");
        //map.put(7, "MAN!!!!!");
    }

    public static String getValueByKey(Map<Integer, String> map, Integer key){
        String result = null;
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if(entry.getKey().equals(key)){
                result = entry.getValue();
            }
        }
        return result;
    }
}
