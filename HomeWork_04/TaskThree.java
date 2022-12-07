package HomeWork_04;

import java.util.Scanner;

public class TaskThree {
    
    // Метод калькулятора с прерыванием операции
    public void calc() {
        System.out.println("Введите выражение: Например: 2 / 5");
        Scanner input;
        String expression;
        String choice;
        do {
            // Вводим выражение
            System.out.print("Введите выражение: ");
            input = new Scanner(System.in);
            expression = input.nextLine();
            System.out.println();

            
            // Разбираем выражение
            String[] term = expression.split(" ");
            int number;

            System.out.println("Вы уверены что хотите посчитать " + expression + "?");
            System.out.println("Введите Cancel если хотите отменить операцию");
            System.out.println("Введите Next если хотите продолжить");
            System.out.println("Введите Done если хотите закончить работать с калькулятором");
            
            choice = input.nextLine();

            if(choice.equals("Next")) {
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
        } while(!choice.equals("Done"));
        input.close();
    }
}
