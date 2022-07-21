import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {87, 721, 1778, 11, 9292};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        // selection sort first iterates through the array and finds the smallest element
        // then it swaps the smallest element with the first element in the array
        // then it repeats the process for the second smallest element and so on
        int temp;
        for (int i = 0; i < array.length; i++){
            int smallest = array[i];
            int index = i;
            for (int j = i; j < array.length; j++){
                if (array[j]<smallest){
                    smallest = array[j];
                    index = j;
                    //System.out.println("new smallest: " + smallest);
                }
            }
            temp = array[i];
            System.out.println("smallest: " + array[index]);
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
