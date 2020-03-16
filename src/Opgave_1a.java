import java.util.Arrays;

public class Opgave_1a {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int x = 5;

        addNumbers(numbers);
        System.out.println("The array is " + Arrays.toString(numbers));
        System.out.println("Does the array contain " + x + "? " + find(numbers,x) );
    }

    public static void addNumbers(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            numbers[i] = (int)(Math.random()*10);
        }
    }

    public static boolean find(int[] numbers, int x){
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] == x)
                return true;
        }
        return false;
    }
}
