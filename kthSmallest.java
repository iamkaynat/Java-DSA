import java.util.*;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 1, 9, 0, 3 };
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);

    }
}
