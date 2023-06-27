import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(getMin(arr, n) + " " + getMax(arr, n));
        }
    }

    public static int getMin(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.min(arr[i], res);
        }
        return res;
    }

    public static int getMax(int[] arr, int n) {
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(arr[i], res);
        }
        return res;
    }
}