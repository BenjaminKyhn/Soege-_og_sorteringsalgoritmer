import java.util.Arrays;

public class Opgave_1d {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        Arrays.sort(numbers);
        System.out.println("The sorted array is " + Arrays.toString(numbers));
        if (binarySearch(numbers,x) < 0)
            System.out.println("The array does not contain " + x);
        else
            System.out.println(x + " is contained in the array at index " + binarySearch(numbers,x));
    }

    public static void addNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
    }

    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < numbers[mid])
                high = mid - 1;
            else if (key == numbers[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}
