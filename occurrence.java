public class occurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 2, 3, 4 };
        int x = 1;
        System.out.println(countOcc(arr, x));
    }

    // Through linear Search
    static int Occ(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    // Through Binary Search
    static int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > x) {
                r = mid - 1;
            } else if (arr[mid] == x) {
                return mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    static int countOcc(int[] arr, int x) {
        int ind = binarySearch(arr, x);
        int left = ind - 1;
        int right = ind + 1;
        int count = 1;
        if (ind == -1) {
            return 0;
        }
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;

        }
        while (right < arr.length && arr[right] == x) {
            count++;
            right++;
        }
        return count;
    }

}
