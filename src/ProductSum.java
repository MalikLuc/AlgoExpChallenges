import java.util.Arrays;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array, int faktor) {
        int sum = 0;
        for (Object element : array) {
            if (element instanceof Integer) {
                sum += ((Integer) element);
            } else if (element instanceof List) {
                sum += productSum((List<Object>) element, faktor + 1);
            }
        }
        return sum * faktor;
    }

    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }
}
