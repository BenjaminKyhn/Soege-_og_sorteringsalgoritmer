import java.util.Arrays;

public class Opgave_2a {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("The sorted array is " + Arrays.toString(numbers));
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    public static void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]){
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
