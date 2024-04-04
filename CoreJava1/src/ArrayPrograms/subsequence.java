package ArrayPrograms;

public class subsequence {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 2, 2, 2 };
        countLargestSubsequence(arr);

    }

    public static void countLargestSubsequence(int[] arr) {
        int startIndex = 0;
        int endIndex = 0;
        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    startIndex = i - maxCount + 2;
                    endIndex = i + 1;
                }
            } else {
                count = 1;
            }

        }

        System.out.println("Largest subsequence count: " + maxCount + ", index start: " + startIndex + ", index end: " + endIndex);
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
