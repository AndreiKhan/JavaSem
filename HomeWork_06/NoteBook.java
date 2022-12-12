package HomeWork_06;

public class NoteBook {
    // Модель, цвет, рам, хдд
    private String model;
    private String color;
    private int ram;
    private int hdd;

    // При создании
    public NoteBook(String model, String color, int ram, int hdd) {
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
    }

    //гетеры, сетеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
   
    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // Выводим классы так как нам надо
    @Override
    public String toString() {
        return color + " " + model + " | RAM: " + ram + " | HDD: " + hdd;
    }

    // Изменяем сравнения подходящее для наших ноутбуков
    @Override
    public boolean equals(Object obj) {
        NoteBook noteBook = (NoteBook) obj;
        if (this == obj || (this.model == noteBook.model && this.ram == noteBook.ram && this.hdd == noteBook.hdd)) {
            return true;
        } else {
            return false;
        }
    }

    // Немного изменяем хэш
    @Override
    public int hashCode() {
        return 31 * model.hashCode() - color.hashCode() + hdd + ram;
    }
}
