package main.java.ru.igrus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,9,18,2,3,5,10,4,3,6,7,89,5,10,5,64);
        System.out.println(getColUniqNum(list));
    }

    private static Map<Integer, Integer> getColUniqNum (List<Integer> list) {
        List<Integer> uniqNumList = list.stream().distinct().sorted().toList();
        Map<Integer, Integer> uniqNumMap = new HashMap<>();
        for(Integer el1 : uniqNumList) {
            int col = 0;
            for (Integer el2 : list) {
                if(el1 == el2)
                    col += 1;
            }
            uniqNumMap.put(el1, col);
        }
        return uniqNumMap;
    }
}
