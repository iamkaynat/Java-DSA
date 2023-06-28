public class sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 2, 2, 0, 0, 1, 1 };
        sortArr2(arr);
        printArr(arr);

    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortArr(int[] arr) {
        int lo = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;

                    high--;
                    break;
                }

            }
        }
    }

    // using count
    static void sortArr2(int[] arr) {

        int i = 0;
        int c1 = 0, c2 = 0, c3 = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c1++;
            } else if (arr[i] == 1) {
                c2++;
            } else {
                c3++;
            }
        }
        i = 0;

        while (c1 > 0) {
            arr[i++] = 0;

            c1--;

        }
        while (c2 > 0) {
            arr[i++] = 1;

            c2--;

        }
        while (c3 > 0) {
            arr[i++] = 2;

            c3--;

        }
    }
}
