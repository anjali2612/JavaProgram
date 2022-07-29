/* Recursion in java  infinite times*/
public class infinite {
    static void infi() {
        System.out.println("Hello from Java!");
        infi();
    }

    public static void main(String[] args) {
        infi();
    }

}