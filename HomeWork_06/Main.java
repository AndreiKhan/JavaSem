package HomeWork_06;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса фильтры и сет ноутбуков
        Filters filters = new Filters();
        HashSet<NoteBook> noteBooks = new HashSet<>();

        // Создаем ноутбуки
        NoteBook noteBook_01 = new NoteBook("ASUS", "Green", 4, 128);
        NoteBook noteBook_02 = new NoteBook("Irbis", "Red", 4, 240);
        NoteBook noteBook_03 = new NoteBook("Samsung", "Blue", 8, 256);
        NoteBook noteBook_04 = new NoteBook("ASUS", "Yellow", 32, 512);
        NoteBook noteBook_05 = new NoteBook("Digma", "Black", 16, 512);
        NoteBook noteBook_06 = new NoteBook("Acer", "Yellow", 2, 64);

        //Добавляем их в сет
        noteBooks.add(noteBook_01);
        noteBooks.add(noteBook_02);
        noteBooks.add(noteBook_03);
        noteBooks.add(noteBook_04);
        noteBooks.add(noteBook_05);
        noteBooks.add(noteBook_06);

        // Выводим на экран доступные функции
        Scanner input = new Scanner(System.in);
        System.out.println("Введите: \n1 - показать все ноутбуки\n" + 
                            "2 - Ввести характеристики и подобрать по ним ноутбуки\n" +
                            "3 - Выбрать и ввести одну характеристику");

        // Выбираем функцию
        String option = input.nextLine();

        // Условия для проверки какую функцию выбрали
        if (option.equals("2")) {
            // Вводим и запоминаем все характеристики
            System.out.print("Введите Модель: ");
            String filterMod = input.nextLine();

            System.out.print("Введите Цвет: ");
            String filterCol = input.nextLine();
        
            System.out.print("Введите объем RAM: ");
            int filterRam = Integer.parseInt(input.nextLine());

            // Если было введено слишком малое число меняем на минимум
            if (filterRam < 2) {
                filterRam = 2;
                System.out.print("Минимальное число 2 использованно в качестве минимума");
            }

            System.out.print("Введите объем HDD: ");
            int filterHdd = Integer.parseInt(input.nextLine());

            // Если было введено слишком малое число меняем на минимум
            if (filterHdd < 64) {
                filterHdd = 64;
                System.out.println("Минимальное число 64 использованно в качестве минимума");
            }

            // Обращаемся к методу за поиском подходящих ноутбуков
            filters.FindNoteBook(noteBooks, filterMod, filterCol, filterRam, filterHdd);

        }

        // Если выбрали пказать все ноутбуки то просто выводим их на экран циклом
        if (option.equals("1")) {
            for (NoteBook noteBook : noteBooks) {
                System.out.println(noteBook);
            }
        }

        // Показываем какие характеристики можно выбрать
        if (option.equals("3")) {
            System.out.println("Выберите характеристику: ");
            System.out.println("1 - Модель");
            System.out.println("2 - Цвет");
            System.out.println("3 - RAM");
            System.out.println("4 - HDD");
            int charac = Integer.parseInt(input.nextLine());

            // В зависимости от выбора, выбираем нужный метод для поиска по фильтру
            if(charac == 1 || charac == 2) {
                System.out.print("Введите что ищите: ");
                String line = input.nextLine();
                filters.FindNoteBookColorModel(noteBooks, line);
            } else {
                System.out.print("Введите что ищите: ");
                int line = Integer.parseInt(input.nextLine());
                filters.FindNoteBookRamHdd(noteBooks, line);
            }
        }
        input.close();
    }
}
