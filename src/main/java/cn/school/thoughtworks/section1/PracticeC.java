package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        List<String> c2 = collection2
                .values()
                .stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());
        List<String> resultList = collection1
                .stream()
                .filter(item -> c2.contains(item))
                .collect(Collectors.toList());
        return resultList;
    }
}
