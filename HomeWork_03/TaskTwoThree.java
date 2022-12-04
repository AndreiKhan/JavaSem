package HomeWork_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskTwoThree {
    
    // Метод получения списка со случайнными числами
    public ArrayList<Integer> getList(int length, int minNum, int maxNum) {
        ArrayList<Integer> randomnumbers = new ArrayList<>();
    
        // Цикл заполнения списка числами
        for (int i = 0; i < length; i++) {
            randomnumbers.add(minNum + (int) (Math.random() * maxNum));
        }

        // Цикл для того чтобы посмотреть какой случайный список получили
        System.out.print(randomnumbers);
        System.out.println(" Созданный случайный список длинной " + length + " с разбросом чисел от " + minNum + " до " + maxNum);
        
        return randomnumbers;
    }
    
    // Метод получения Максимального, Минимального, Среднего числа
    public void getMinMaxAver(ArrayList<Integer> numbers) {
        int count = 0;
        Iterator<Integer> iterator = numbers.iterator();
        int next;

        // Если длинна списка четная
        if(numbers.size() % 2 == 0){

            // То находим среднее арифметическое
            while (iterator.hasNext()) {
                next = iterator.next();
                count += next;
            }
            System.out.println("Среднее арифметическое из списка " + count);
        } else {

            // Если длинна списка не четная то выводим элемент находящийся в центре списка
            count = numbers.get(numbers.size() / 2);
            System.out.println("Число находящееся в центре списка " + count);
        }
        
        System.out.println("Максимальное значение из списка " + Collections.max(numbers));
        System.out.println("Минимальное значение из списка " + Collections.min(numbers));
    }
}
