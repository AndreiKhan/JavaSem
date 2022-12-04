package HomeWork_03;

public class TaskOne {

    // Метод получения случайного массива принимает ДЛИНУ, МИНИМАЛОЬНОЕ СЛУЧАЙНОЕ ЧИСЛО, МАКСИМАЛЬНОЕ СЛУЧАЙНОЕ ЧИСЛО
    public int[] getRandomArray(int length, int minNum, int maxNum) {
        int[] randomArray = new int[length];

        // Цикл заполнения массива числами
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = minNum + (int) (Math.random() * maxNum);
        }

        // Цикл для того чтобы посмотреть какой случайный массив получили
        for (int i : randomArray) {
            System.out.print(i + " ");
        }
        System.out.println("Созданный случайный массив длинной " + length + " с разбросом чисел от " + minNum + " до " + maxNum);

        return randomArray;
    }

    // Метод для сортировки массива слиянием
    public int[] mergeSort(int[] array) {

        //Если массив с одним элементом то вернем его
        if(array.length == 1) {
            return array;
        }

        // Создаем переменные для получения нужной длины двух новых массивов
        int length1;
        int length2;

        // Если полученный массив не четной длины то нужно немного скорректировать длину одного массива
        if (array.length % 2 == 0) {
            length1 = array.length / 2;
            length2 = array.length / 2;
        } else {
            length1 = array.length / 2 + 1;
            length2 = array.length / 2;
        }

        // Создаем массивы нужной длины
        int[] arrayForSort_01 = new int[length1];
        int[] arrayForSort_02 = new int[length2];

        //Заполняем их нужными данными из полученного массива
        System.arraycopy(array, 0, arrayForSort_01, 0, length1);
        System.arraycopy(array, array.length - length2, arrayForSort_02, 0, length2);
        
        // Это условие для начала рекурсии метода
        if (array.length % 2 == 0) {

            // Если длина массива четная, то мы отправляем 2 массива дальше на разделение
            arrayForSort_01 = mergeSort(arrayForSort_01);
            arrayForSort_02 = mergeSort(arrayForSort_02);

            // После того как они оба вернулись мы возвращаем эти два массива которые прошли сияние и сортировку
            return mergeArrays(arrayForSort_01, arrayForSort_02);
        } else {

            // Если длина массива не четная, то мы отправляем 1 массив дальше на разделение, а второй (если его длина равна 1)
            // мы оставляем ждать первый массив для последующего их слияния
            arrayForSort_01 = mergeSort(arrayForSort_01);

            // Если длина массива не равна 1, то отправляем его на разделение
            if (array.length != 1) {
                arrayForSort_02 = mergeSort(arrayForSort_02);
            }

            // После того как они оба вернулись мы возвращаем эти два массива которые прошли сияние и сортировку
            return mergeArrays(arrayForSort_01, arrayForSort_02);
        }
    }

    // Метод для сортировки 2 массивов и их слияния
    public int[] mergeArrays(int[] array_01, int[] array_02) {
        
        // Создаем нужный массив нужной длины
        int[] mergedArray = new int[array_01.length + array_02.length];
        // Создаем счетчики для отслеживания индексов
        int j = 0;
        int k = 0;
        int i = 0;

        // Цикл для сортировки массива, если один массив закончится быстрее, то цикл заканчивается
        while(j < array_01.length && k < array_02.length) {
            if (array_01[j] < array_02[k]) {
                mergedArray[i] = array_01[j];
                j++;
            } else {
                mergedArray[i] = array_02[k];
                k++;
            }
            i++;
        }

        // Условие для выбора нужного цикла
        if (j == array_01.length) {

            // Цикл для прохода до конца массива и заполнения его оставшимися числами
            while(i < mergedArray.length) {
                mergedArray[i] = array_02[k];
                k++;
                i++;
            }
        } else {

            // Цикл для прохода до конца массива и заполнения его оставшимися числами
            while(i < mergedArray.length) {
                mergedArray[i] = array_01[j];
                j++;
                i++;
            }
        }
        return mergedArray;
    }
}
