package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> countMap = new HashMap<>();
        int count;
        for (String str : collectionA) {
            if(str.contains("-")) {
                String[] split = str.split("-");
                str = split[0];
                count = Integer.parseInt(split[1]);
            } else {
                count = countMap.get(str) == null ? 1 : countMap.get(str) + 1;
            }
            countMap.put(str, count);
        }
        cn.school.thoughtworks.section3.PracticeB practiceB = new cn.school.thoughtworks.section3.PracticeB();
        Map<String, Integer> updatedCollection = practiceB.createUpdatedCollection(countMap, object);
        return updatedCollection;
    }
}
