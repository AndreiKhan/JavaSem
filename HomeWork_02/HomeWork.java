package HomeWork_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        Task_01 task1 = new Task_01();
        Task_02 task2 = new Task_02();

        // task1.Task1();
        // task2.Task2();
    }
}

//---------------------------------------Задача 1------------------------------------------------
// Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.
//-----------------------------------------------------------------------------------------------
// Как я понял, задание в том чтобы мы могли найти нужные строки в файлах, запомнить их и вывести куда либо
// Поэтому это решение выводит в консоль все записи лог файла в консоль
class Task_01 {

    // Метод по выводу нужной строки
    void Task1() {
        // Вводим переменную которая будет искать ключевое слово INFO
        String debug = "INFO";

        // Ловим ошибки
        try {
            // Создаем ридер файла
            File log = new File("log1.txt");

            FileReader lg = new FileReader(log);

            BufferedReader reader = new BufferedReader(lg);

            // Считываем первую строку
            String line = reader.readLine();

            // Считываем весь файл построчно пока не дойдем до конца файла
            while (line != null) {

                // Если в строке необходимое слово, то выводим необходимую строку в консоль
                if(line.contains(debug)) {
                    System.out.println(line);
                }
                
                // Считываем следующую строку
                line = reader.readLine();
            }

            reader.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//------------------------------------------Задача 2----------------------------------------------------------------
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//------------------------------------------------------------------------------------------------------------------
// Каждый раз когда в массиве происходят изменения, массив переписывается в файл log2.txt
class Task_02 {

    // Массив для сортировки
    int[] array = {4,1,3,5,2};

    void Task2() throws IOException{

        int num;
        String line;

        FileWriter writer = new FileWriter("log2.txt");

        line = Arrays.toString(array);
        writer.write(line + "\n");

        // Цикл для прохождения по всему массива, перенося самуюбольшую цифру в правую сторону
        for (int i = 1; i < array.length; i++) {

            // Два цикла используются для того что бы мы больше не проверяли последние символы так как знаем что в самом конце массива самая большая цифра
            for (int j = 0; j < array.length - i; j++) {

                // Меняем числа местами
                if(array[j] > array[j + 1]) {

                    num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;

                    // Добавляем результаты каждой сортировки в файл
                    line = Arrays.toString(array);
                    writer.write(line + "\n");
                }
            }
        }
        // без этого файл не сохраняется
        writer.flush();
        writer.close();
    }
}
