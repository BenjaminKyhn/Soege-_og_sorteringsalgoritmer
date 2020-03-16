import java.util.Arrays;

public class Opgave_1c {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        System.out.println("The maximum number in the array is " + findMax(numbers));
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    public static int findMax(int[] numbers){
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
}
