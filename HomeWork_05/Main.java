package HomeWork_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------1 задача--------------------------------------------------------
        //--Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов--

        // Task_01 task_01 = new Task_01();
        // task_01.phones("Иван");


        //------------------------------------------2 задача--------------------------------------------------
        //---------Пусть дан список сотрудников:Иван Иванов Написать программу, которая найдет----------------
        //---и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности---

        // Task_02 task_02 = new Task_02();
        // task_02.workers();


        //----------------------------------------------3 задача--------------------------------------------------
        //-Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022-

        Task_03 task_03 = new Task_03();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите римское число: ");
        int result = task_03.romNum(in.next());

    }
}