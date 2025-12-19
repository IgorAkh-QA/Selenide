package own.akhmet;

import java.util.*;

public class Collections  {

    public void setStringList(List<String> list) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Dima");
        stringList.get(0);
        stringList.isEmpty();
        stringList.sort(String::compareTo);
        stringList.remove("Petr");
        stringList.remove(0);
        stringList.indexOf("Petr");
        stringList.stream()
                .filter(s -> !s.equals("Petr")) //Фильтруем
                .map(s -> s.toLowerCase());//ПреобразовываемList<String> stringList = new ArrayList<>();

        for (String var : stringList){
            System.out.println(var);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.get(0);
        integerList.isEmpty();

        for (int var : integerList){
            System.out.println(var);
        }

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) != -1) {
                continue; //Прерывает операцию
            }
            //Сложное вычисление
            System.out.println("Радуемся, нашли: " + integerList.get(i));
            break;
        }

        Set<Integer> intSet = new HashSet<>(); //Коллекция уникальных элементов. Полезна для контроля повторяющихся записей.
        intSet.add(1);
        intSet.add(2);

        Map<Integer, Human> aMap = new HashMap<>();  //Кода есть отношение сложного объекта к простому ключу.
        aMap.put(123123, new Human("Vanya", 33, "Male"));
        aMap.put(123124, new Human("Petr", 30, "Male"));
        aMap.put(123125, new Human("Dima", 22, "Male"));

        Set<Integer> passportNumbers = aMap.keySet();
        Collection<Human> humans = aMap.values();
        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet();

        for (Map.Entry<Integer, Human> entry : entrySet) {
            if (entry.getKey() == 123123) {
                System.out.println("Нашли пертра:" + entry.getValue().getName());
            }

        }

        aMap.containsValue(aMap.get(123123));
        aMap.get(123123);

    }

}
