public class SmallArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 34, 12, 43, 21, 5, 34, 51 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element is : " + min);

    }

}