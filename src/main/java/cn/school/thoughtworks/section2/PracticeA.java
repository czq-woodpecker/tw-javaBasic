package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> countMap = new HashMap<>();
        int count;
        for (String str : collection1) {
            count = countMap.get(str) == null ? 0 : countMap.get(str);
            countMap.put(str, ++count);
        }
        return countMap;
    }
}
