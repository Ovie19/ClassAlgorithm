import java.util.Arrays;

public class SquareArrayAscending {

    public static int[] getArraySquareInAscendingOrder(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            int smallestIndex = index;
            for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
                if (Math.abs(numbers[smallestIndex]) > Math.abs(numbers[innerIndex])) {
                    smallestIndex = innerIndex;
                }
            }
            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[index];
            numbers[index] = temp;
            result[index] = temp * temp;
        }

        return result;
    }
}
