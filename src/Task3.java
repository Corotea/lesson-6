public class Task3 {
    public static void main(String[] args) {
        System.out.println(fianacci(9));

    }

    static long fianacci(long n) {
        if(n <= 1) {
            return 0;
        }
        else if(n == 2) {
            return 1;
        }
        return fianacci(n-1) + fianacci(n-2);
    }
}
