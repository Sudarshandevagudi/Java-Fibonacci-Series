public class FibonacciSeries {

    public static void main(String[] args) {
        int terms = 10;
        generateFibonacci(0, 1, terms);
    }

    public static void generateFibonacci(int a, int b, int count) {
        if (count == 0) {
            return;
        }

        System.out.print(a + " ");
        generateFibonacci(b, a + b, count - 1);
    }
}
