import java.util.Arrays;

public class Opgave_2b {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("The sorted array is " + Arrays.toString(numbers));
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    public static void bubbleSort(int[] numbers){
        boolean swapped;
        int temp;

        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }
}
