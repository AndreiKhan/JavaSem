//---------------Задача 3----------------
//----Реализовать простой калькулятор----
//---------------------------------------
package HomeWork_01;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        // Вводим выражение
        Scanner input = new Scanner(System.in);
        System.out.println("Введите выражение: Например: 2 / 5");
        String expression = input.nextLine();
        input.close();

        // Разбираем выражение
        String[] term = expression.split(" ");
        int number;

        // Кейс для проверки какой знак мы использовали
        switch(term[1]) {
            case "+":
                number = Integer.parseInt(term[0]) + Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                break;

            case "-":
                number = Integer.parseInt(term[0]) - Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                break;

            case "*":
                number = Integer.parseInt(term[0]) * Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                break;

            case "/":
                number = Integer.parseInt(term[0]) / Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                break;
        }
    }
}
