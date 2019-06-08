package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> countMap = new HashMap<>();
        int count;
        for (String str : collection1) {
            if(str.contains("-")) {
                String[] split = str.split("-");
                str = split[0];
                count = Integer.parseInt(split[1]);
            } else {
                count = countMap.get(str) == null ? 1 : countMap.get(str) + 1;
            }
            countMap.put(str, count);
        }
        return countMap;
    }
}
