//-----------------------------------------------Задача 1--------------------------------------------
//----Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)----
//---------------------------------------------------------------------------------------------------
package HomeWork_01;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        // Создаем переменные хранящие в себе ответ для решения задачи
        int triangleNum = 0;
        int factorialNum = 1;

        // Вводим число от которого хотим найти треугольное число и факториал
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        input.close();

        // Цикл для нахождения факториала и треугольника числа
        for (int i = 1; i <= number; i++) {
            triangleNum += i;
            factorialNum *= i;
        }

        // Вывод ответа
        System.out.printf("Треугольник числа %d равен => %d\n", number, triangleNum);

        System.out.printf("Факториал числа %d равен => %d\n", number, factorialNum);

    }
}