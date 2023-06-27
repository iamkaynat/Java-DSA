import java.util.*;

public class Repetition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            int i = 0, j = 1, count = 1, answer = 0;
            while (j < word.length() - 1) {
                if (word.charAt(i) != word.charAt(j)) {
                    i = j - 1;
                    j++;
                    count = 0;
                }
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                    j++;
                    answer = count;
                }
            }
            System.out.println(answer);
        }
    }
}
