

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        getArray(arr);
        print(arr);
        System.out.println("\n" + max(arr));
        System.out.println(min(arr));
        System.out.println(average(arr));
        System.out.println(medium(arr));
    }

    static void getArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 500);
        }
    }

    static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    static int max(int[] array) {
        int max = array[0];

        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    static int min(int[] array) {
        int min = array[0];

    for (int element : array) {
        if (element < min) {
            min = element;
        }
    }
        return min;
    }

    static double average(int[] array) {
        double average = 0;
        for (int element : array) {
            average += element;
        }
        return average / array.length;
    }
    static void swap(int[] array, int first, int second) {
        int n = array[first];
        array[first] = array[second];
        array[second] = n;
    }
    static int medium(int[] array) {
        boolean iteration = true;
        while (iteration) {
            iteration = false;
            for(int i = 1; i < array.length; i++) {
                if(array[i] < array[i-1]) {
                    swap(array, i, i-1);
                    iteration = true;
                }
            }
        }
        int mid;
        mid = array[(array.length / 2)];
        return mid;
    }
}
