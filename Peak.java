
//Find a peak element which is not smaller than its neighbours
import java.util.*;

public class Peak {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findPeak(arr));
            System.out.println(findByBinary(arr));
        }
    }

    // naive approach

    public static int findPeak(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                return arr[i];
            }
            if (i == arr.length - 1 && arr[i - 1] < arr[i]) {
                return arr[i];
            }
            if (i > 0 && (arr[i] > arr[i + 1] && arr[i] > arr[i - 1])) {
                return arr[i];
            }
            i++;
        }
        return -1;
    }

    // binary search - optimised approach
    public static int findByBinary(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((mid == 0 || arr[mid] > arr[mid + 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid - 1])) {
                return arr[mid];
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}
