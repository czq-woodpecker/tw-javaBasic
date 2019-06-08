package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> countMap = new HashMap<>();
        int count = 0;
        for (String str : collection1) {
            if (str.contains("-")) {
                String[] split = str.split("-");
                str = split[0];
                count = Integer.parseInt(split[1]);
            } else if (str.contains(":")) {
                String[] split = str.split(":");
                str = split[0];
                count = Integer.parseInt(split[1]);
            } else if (str.contains("[")) {
                String[] split = str.split("\\[");
                str = split[0];
                count = Integer.parseInt(split[1].substring(0, split[1].length() - 1));
            } else {
                count = 1;
            }
            count += countMap.get(str) == null ? 0 : countMap.get(str);
            countMap.put(str, count);
        }
        return countMap;
    }
}
