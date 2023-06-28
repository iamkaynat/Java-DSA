public class MobeNegative {
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveArr(arr);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void moveArr(int[] arr) {
        int lo = 0;
        int temp = 0;
        int high = arr.length - 1;
        while (lo <= high) {
            if (arr[lo] < 0) {

                lo++;

            }

            if (arr[lo] > 0) {
                if (arr[high] > 0) {
                    high--;
                } else {
                    temp = arr[lo];
                    arr[lo] = arr[high];
                    arr[high] = temp;
                    high--;
                }

            }
        }
    }
}
