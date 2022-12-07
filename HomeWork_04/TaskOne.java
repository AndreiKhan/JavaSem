package HomeWork_04;

import java.net.SocketTimeoutException;
import java.util.LinkedList;
import java.util.concurrent.ForkJoinTask;

public class TaskOne {

    // Метод получения случайного листа принимает ДЛИНУ, МИНИМАЛЬНОЕ СЛУЧАЙНОЕ ЧИСЛО, МАКСИМАЛЬНОЕ СЛУЧАЙНОЕ ЧИСЛО
    public void getRandomLinkedList(int length, int minNum, int maxNum) {
        LinkedList<Integer> randomList = new LinkedList<>();

        // Цикл заполнения листа числами
        for (int i = 0; i < length; i++) {
            randomList.add(minNum + (int) (Math.random() * maxNum));
        }

        // Цикл для того чтобы посмотреть какой случайный лист получили
        for (int i : randomList) {
            System.out.print(i + " ");
        }
        System.out.println("Созданный случайный лист длинной " + length + " с разбросом чисел от " + minNum + " до " + maxNum + "\n");

        // Дальше сразу обращаемся к методу для того чтобы лист перевернули
        reverseLinkedList(randomList);
    }

    // Метод для получения перевернутого листа
    public void reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();

        // Цикл заполнения перевернутого листа с помощью команды addLast
        for (int i = 1; i <= list.size(); i++) {
            reversList.addLast(list.get(list.size() - i));
        }

        // Выводим на экран результат работы
        System.out.println("Полученный список -> " + list);
        
        System.out.println("Перевернутый список -> " + reversList);
    }
}
