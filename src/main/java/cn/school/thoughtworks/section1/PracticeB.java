package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //将collection2中所有List的元素拼接成一个新的List
        List<String> c2 = collection2.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        List<String> resultList = collection1.stream().filter(item -> c2.contains(item)).collect(Collectors.toList());
        return resultList;
    }
}
