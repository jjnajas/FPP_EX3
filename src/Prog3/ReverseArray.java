package Prog3;

public class ReverseArray {

    public static void reverse(int[] arr) {
        reverse(arr, 0, arr.length - 1);
    }
    private static void reverse(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 7, 56, 33, 8, 18};

        System.out.print("Before Reverse: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        reverse(numbers);

        System.out.print("After Reverse: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
