public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        String s = "abcdef";
        System.out.println(revStr(s));
        printArray(arr);
        rArray(arr);
        printArray(arr);

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rArray(int[] arr) {
        // reverse array through swapping the elements
        int l = 0;
        int r = arr.length - 1;
        int temp;
        while (l <= r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static String revStr(String s) {
        String revS = "";
        char ch;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            revS += ch;
        }
        return revS;

    }
}
