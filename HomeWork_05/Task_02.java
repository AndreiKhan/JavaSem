package HomeWork_05;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Task_02 {
    
    // Метод для нахождения количества вхождений имен в список
    public void workers() {
        // Заполняем список
        LinkedList<String> list = new LinkedList<>();

        list.add("Иван");
        list.add("Андрей");
        list.add("Антон");
        list.add("Ира");
        list.add("Андрей");
        list.add("Иван");
        list.add("Иван");
        list.add("Максим");
        list.add("Леша");

        // Создаем мапу и заполняем ее (Имя это ключ, количество вхождений это значение)
        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            map.put(string, Collections.frequency(list, string));
        }

        int repeats = Collections.max(map.values());

        // Проходим по мапе выводя сначала имена с наибольшим значением и когда дорйдем до 0. Закончим цикл
        while(repeats != 0) {
            for(Map.Entry<String, Integer> workersEntry : map.entrySet()) {

                if (workersEntry.getValue() == repeats) {
                    System.out.println(workersEntry.getKey() + " повторился в списке " + workersEntry.getValue() + " раза");
                }
            }
            repeats--;
        }
    }
}
