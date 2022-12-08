package HomeWork_05;

import java.util.HashMap;
import java.util.Map;

public class Task_03 {
    
    // Метод перевода римских чисел
    public int romNum(String rom) {
        // Заполняем мапу римскими числами
        Map<Character, Integer> romNumbers = new HashMap<>();

        romNumbers.put('I', 1);
        romNumbers.put('V', 5);
        romNumbers.put('X', 10);
        romNumbers.put('L', 50);
        romNumbers.put('C', 100);
        romNumbers.put('D', 500);
        romNumbers.put('M', 1000);

        // Разбиваем полученную строку
        char[] numbers = rom.toCharArray();

        // Записываем первый знак числом в переменную
        int count = romNumbers.get(numbers[0]);

        // Если был введен один символ то сразу возвращаем результат
        if(numbers.length != 1) {

            // Цикл для подсчета всех римских символов
            for (int i = 1; i < numbers.length; i++) {

                // Условие для проверки надо ли суммировать или вычитать
                if (romNumbers.get(numbers[i]) > romNumbers.get(numbers[i - 1])) {
                    count -= romNumbers.get(numbers[i]);
                } else {
                    count += romNumbers.get(numbers[i]);
                }   
            }
        }
        System.out.println("Результат перевода римских чисел -> " + count);
        return count;
    }
}
