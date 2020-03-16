import java.util.Arrays;

public class Opgave_1b {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        System.out.println(x + " appears " + findAll(numbers,x) + " time(s) in the array");
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    public static int findAll(int[] numbers, int x){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x)
                count++;
        }
        return count;
    }
}
