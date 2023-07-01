
public class sum {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int sum = 33;
        subArray(arr, sum);

    }

    static void subArray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println(i);
                return;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    currentSum += arr[j];
                    if (currentSum == sum) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }

    }
}
