class App {
    static void main(String[] args) {
        def list = [1, 4, 9, 18, 2, 3, 5, 10, 4, 3, 6, 7, 89, 5, 10, 5, 64]

        print getColUniqNum(list)
    }

    static Map<Integer,Integer> getColUniqNum(List list) {
        def uniqNumList = list.stream().distinct().sorted().toList()
        def uniqNumMap = [:];
        for(def el1 : uniqNumList) {
            def col = 0
            for(def el2: list) {
                if (el1 == el2)
                    col += 1
            }
            uniqNumMap.put(el1, col)
        }
        return uniqNumMap
    }
}