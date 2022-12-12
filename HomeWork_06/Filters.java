package HomeWork_06;

import java.util.HashSet;

public class Filters {
    // Метод нахождения ноутбуков по характеристикам которые им соотвутствуют
    public void FindNoteBook (HashSet<NoteBook> noteBooks, String model, String color, int ram, int hdd) {
        
        System.out.println("\nНоутбуки соответствующие критериям: ");
        
        // Проверяем каждый ноутбук, и если есть совпадения, выводим его
        for (Object object : noteBooks) {
            NoteBook noteBook = (NoteBook) object;
            
            if (noteBook.getModel().equals(model) || 
                noteBook.getColor().equals(color) || 
                noteBook.getRam() == (ram) || 
                noteBook.getHdd() == (hdd)) {

                System.out.println(object);
            }
        }
    }

    // проверка ноутбуков по объемам RAM и HDD
    public void FindNoteBookRamHdd (HashSet<NoteBook> noteBooks, int numbers) {
        
        System.out.println("\nНоутбуки соответствующие критериям: ");
        
        // Если есть подходящий, выводим его
        for (Object object : noteBooks) {
            NoteBook noteBook = (NoteBook) object;
            
            if ( noteBook.getRam() == (numbers) || 
                noteBook.getHdd() == (numbers)) {
                System.out.println(object);
            }
        }
    }

    // проверка ноутбуков по Model и Color
    public void FindNoteBookColorModel (HashSet<NoteBook> noteBooks, String appear) {
        
        System.out.println("\nНоутбуки соответствующие критериям: ");
        
        // Если есть подходящий, выводим его
        for (Object object : noteBooks) {
            NoteBook noteBook = (NoteBook) object;
            
            if (noteBook.getModel().equals(appear) || 
                noteBook.getColor().equals(appear)) {
                System.out.println(object);
            }
        }
    }
}
