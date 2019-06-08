package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> collectionB = object.values().stream().flatMap(item -> item.stream()).collect(Collectors.toList());
        int count;
        for (String str : collectionB) {
            if(collectionA.containsKey(str) && (count = collectionA.get(str)) >= 3) {
                collectionA.put(str, count - count / 3);
            }
        }
        return collectionA;
    }
}
