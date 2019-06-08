package cn.school.thoughtworks.section3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> countMap = new HashMap<>();
        int count;
        for (String str : collectionA) {
            count = countMap.get(str) == null ? 0 : countMap.get(str);
            countMap.put(str, ++count);
        }
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> updatedCollection = practiceB.createUpdatedCollection(countMap, object);
        return updatedCollection;
    }
}
