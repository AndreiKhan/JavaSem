package HomeWork_02;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


//--------------------Задача 4---------------------------
// К калькулятору из предыдущего дз добавить логирование.
//-------------------------------------------------------
// У меня никак не получается использовать логи для разных классов, поэтому перенес пока что в отдельный файл
public class Task_04 {
    public static void main(String[] args) throws IOException {
        // Лог для записи логов в Log4.txt
        Logger logger = Logger.getLogger(Task_04.class.getName());
        FileHandler fh = new FileHandler("log4.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("Калькулятор начал работу");//

        // Вводим выражение
        Scanner input = new Scanner(System.in);
        System.out.println("Введите выражение: Например: 2 / 5");

        String expression = input.nextLine();
        input.close();

        logger.info("пользователь ввел: " + expression);//

        // Разбираем выражение
        String[] term = expression.split(" ");
        int number;

        // Кейс для проверки какой знак мы использовали
        switch(term[1]) {
            case "+":
                number = Integer.parseInt(term[0]) + Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                logger.info("Пользователь воспользовался функцией сложения");//
                logger.info("Калькулятор завершил работу");//
                break;

            case "-":
                number = Integer.parseInt(term[0]) - Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                logger.info("Пользователь воспользовался функцией вычитания");//
                logger.info("Калькулятор завершил работу");//
                break;

            case "*":
                number = Integer.parseInt(term[0]) * Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                logger.info("Пользователь воспользовался функцией умножения");//
                logger.info("Калькулятор завершил работу");//
                break;

            case "/":
                number = Integer.parseInt(term[0]) / Integer.parseInt(term[2]);

                System.out.println(expression + " = " + number);
                logger.info("Пользователь воспользовался функцией деления");//
                logger.info("Калькулятор завершил работу");//
                break;
        }
    }
}
