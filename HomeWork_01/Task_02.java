//------------------Задача 2--------------------
//----Вывести все простые числа от 1 до 1000----
//----------------------------------------------
package HomeWork_01;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

        // Создаем экземпляр класса
        Task2 obj = new Task2();

        // Вводим число до которого хотим найти простые числа
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.printf("Простые числа до %d\n", number);
        input.close();

        // Обращаемся к методу
        obj.simpleNumber(number);
    }
}

// Создаем класс с методом решения
class Task2 {
    // Переменная для определения является число простым
    boolean simple;

    // Метод для получения каждых простых чисел
    void simpleNumber(int num) {
        
        for (int i = 2; i <= num; i++) {
            simple = true;

            for (int f = 2; f < i; f++) {

                if (i % f == 0) {
                    // Если число не является простым мы заканчиваем внутренний цикл и переходим к следующему числу
                    simple = false;
                    break;
                }
            }

            // Если число простое то мы его выводим
            if(simple) {
                System.out.printf("%d ",i);
            }
        }
    }
}
