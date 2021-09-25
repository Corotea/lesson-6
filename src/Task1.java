import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        int[] arr = createArray(3);
        getArray(arr);
        print(arr);
    }

    /**
     *Создает массив заданого размера
     *
     * @param size размер массива
     * @return новый массив с элементами
     */
    static int[] createArray(int size) {
        return new int[size];
    }

    /**
     * Заполняет массив элементами пользовательским вводом
     *
     * @param arr переданный массив
     */
    static void getArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    /**
     * Выводит элементы массива на экран
     *
     * @param array переданный массив
     */
    static void print(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
