public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5, 7 };
        int arr2[] = { 2, 3, 5, 6 };
        union(arr1, arr2);
        System.out.println();
        intersection(arr1, arr2);
    }

    // Assuming elements are distinct
    static void union(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;

            }
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }

        }
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }

    }

    static void intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;

            } else {
                j++;
            }
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;

            }

        }
    }

}
