package HomeWork_04;

import java.util.LinkedList;

public class TaskTwo {
    
    // Метод помещает элемент в конец очереди
    public LinkedList<Integer> enqueue(LinkedList<Integer> list, int number) {
        
        // Метод добавления в конец очереди
        list.addLast(number);

        System.out.println("Добавлен элемент в конец очереди " + number);
        System.out.println(list);

        return list;
    }

    // Метод возвращает первый элемент из очереди и удаляет его
    public int dequeue(LinkedList<Integer> list) {
        // Метод получения первого элемента
        int number = list.getFirst();

        System.out.println("Первый элемент в очереди " + number);
        System.out.println("Первый элемент удален");

        // Метод удаления первого элемента
        list.removeFirst();
        System.out.println(list);

        return number;
    }

    // Метод возвращает первый элемент из очереди, не удаляя
    public int first(LinkedList<Integer> list) {
        // Метод получения первого элемента
        int number = list.getFirst();
        
        System.out.println("Первый элемент в очереди " + number);
        System.out.println(list);

        return number;
    }

    // Метод получения случайного листа принимает ДЛИНУ, МИНИМАЛЬНОЕ СЛУЧАЙНОЕ ЧИСЛО, МАКСИМАЛЬНОЕ СЛУЧАЙНОЕ ЧИСЛО
    public LinkedList<Integer> getRandomLinkedList(int length, int minNum, int maxNum) {
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

        // Возвращаем созданный лист
        return randomList;
    }
}
