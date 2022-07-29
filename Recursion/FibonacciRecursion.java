public class FibonacciRecursion {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 15;
        System.out.println(n1 + " " + n2);
        fibonacci(count - 2);
    }
}
