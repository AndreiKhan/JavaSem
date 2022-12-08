package HomeWork_05;

import java.util.HashMap;
import java.util.Map;

public class Task_01 {

    // Метод для вывод номеров телефонов по именам
    public void phones(String name) {
        // Заполняем мапу
        Map<Integer, String> phoneNumbers = new HashMap<>();

        phoneNumbers.put(12345, "Иван");
        phoneNumbers.put(34564, "Андрей");
        phoneNumbers.put(52345, "Антон");
        phoneNumbers.put(12356, "Ира");
        phoneNumbers.put(58678, "Андрей");
        phoneNumbers.put(70898, "Иван");
        phoneNumbers.put(15775, "Иван");
        phoneNumbers.put(67892, "Максим");
        phoneNumbers.put(75612, "Леша");

        System.out.println("Телефоны: " + phoneNumbers);
        System.out.println("Все телефоны человека " + name);

        // Цикл для вывода всех номеров по имени
        for(Map.Entry<Integer, String> phoneEntry : phoneNumbers.entrySet()) {
            
            if (phoneEntry.getValue().equals(name)) {
                System.out.println(phoneEntry.getKey());
            }
        }
    }
}
