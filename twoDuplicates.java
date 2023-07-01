
class twoDuplicates {
    static void printRepeating(int arr[], int size) {
        int count[] = new int[size];
        int i;

        System.out.print("Repeating elements are ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int arr_size = arr.length;
        printRepeating(arr, arr_size);
    }
}