package HomeWork_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса
        TaskOne taskOne = new TaskOne();
        // 2 и 3 задание объедененны в один класс
        TaskTwoThree taskTwoThree = new TaskTwoThree();


        //--------------------------------1 задача---------------------------------------------------------
        //---------------Реализовать алгоритм сортировки слиянием------------------------------------------

        // Создаем массивы для сортировки слиянием
        // массив NUMBERS изначально заданный массив
        // массив RANDNUM это массив который мы получили той длины какой хоти и со случайными числами

        int[] randomNumbers = taskOne.getRandomArray(10, 1, 10); // случайный массив

        // Обращаемся к методу сортировки слиянием и отправляем ему наш массив
        int[] taskRandom = taskOne.mergeSort(randomNumbers);
        // Цикл для того чтобы посмотреть результат сортировки
        for (int i : taskRandom) {
            System.out.print(i + " ");
        }
        System.out.print("Отсортированный случайный список");
        System.out.println();
        
        int[] defaultNumbers = {1, 10, 2, 9, 3, 5, 8, 7, 4, 6}; // заготовленный массив

        int[] taskDefault = taskOne.mergeSort(defaultNumbers);
        for (int i : taskDefault) {
            System.out.print(i + " ");
        }
        System.out.print("Отсортированный заготовленный список");
        System.out.println();


        //----------------------------------2 задача-------------------------------------------
        //------Пусть дан произвольный список целых чисел, удалить из него четные числа--------
        
        // //обращаемся к методу для получения случайного списка
        // ArrayList<Integer> numbersList = taskTwoThree.getList(10, 1, 10);

        // // Единственная строчка может сделать всю работу для 2 задания
        // // i - это элемент списка, если условие выполняется, то элемент удаляется
        // numbersList.removeIf(i -> i % 2 == 0);
        // System.out.print(numbersList);
        // System.out.println(" Список с удаленными четными числами");


        //------------------------------------------------3 задача-----------------------------------------------------
        //------Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка--------

        // // Обращаемся к методу для получения случайного списка
        // ArrayList<Integer> numbersList = taskTwoThree.getList(10, 1, 10);
        
        // // Обращаемся к методу для нахождения Максимального, Минимального, Среднего числа
        // // Если список с четной длиной, то получим среднее арифметическое
        // // Если список с не четной длиной, то получим число находящееся в центре списка
        // taskTwoThree.getMinMaxAver(numbersList);
    }
}
