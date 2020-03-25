import java.util.Arrays;

public class Opgave_2a {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("The array sorted in ascending order is " + Arrays.toString(numbers));
        selectionSortDescending(numbers);
        System.out.println("The array sorted in descending order is " + Arrays.toString(numbers));
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    // Ascending selection sort
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

    // Descending selection sort
    public static void selectionSortDescending(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMax = numbers[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMax < numbers[j]){
                    currentMax = numbers[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i){
                numbers[currentMaxIndex] = numbers[i];
                numbers[i] = currentMax;
            }
        }
    }
}
