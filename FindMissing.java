
public class FindMissing {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 3, 7, 5 };
        int n = 8;
        int mis = find(arr, n);
        int mis1 = find1(arr, n);
        System.out.println(mis);
        System.out.println(mis1);
    }

    static int find(int[] arr, int n) {

        int sum1 = (n * (n + 1)) / 2;
        int sum = 0;
        int mis = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];

        }
        mis = sum1 - sum;

        return mis;
    }

    static int find1(int[] arr, int n) {
        int temp[] = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            temp[arr[i] - 1] = 1;

        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                ans = i + 1;
            }
        }
        return ans;

    }

}
