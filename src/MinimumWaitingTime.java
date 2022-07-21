import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        // sort array
        Arrays.sort(queries);
        System.out.println(Arrays.toString(queries));
        // add the waiting tim together
        int waitingTime = 0;
        for (int i = 0; i < queries.length; i++){
            for (int j = 0; j < i; j++){
                waitingTime += queries[j];
            }
        }
        return waitingTime;
    }
}
