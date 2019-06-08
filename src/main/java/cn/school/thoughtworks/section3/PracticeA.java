package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {

        List<String> collectionB = object.values().stream().flatMap(item -> item.stream()).collect(Collectors.toList());
        for (String str : collectionB) {
            if(collectionA.containsKey(str)) {
                collectionA.put(str, collectionA.get(str) - 1);
            }
        }
        return collectionA;
    }
}
