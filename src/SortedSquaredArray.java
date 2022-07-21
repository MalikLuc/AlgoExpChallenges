import java.util.Arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        // square ech element in the array with a lambda expression
        return Arrays.stream(array).map(x -> x * x).sorted().toArray();
    }
}
