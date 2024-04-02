package ArrayPrograms;

public class CountFrequency {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 2, 3, 4, 5, 5, 64, 3, 24, 3 };

        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                int frequency = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        frequency++;
                        count[j] = -1; // Mark the duplicate as -1
                    }
                }

                count[i] = frequency; // Store the frequency in count array
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                System.out.println("Frequency of " + arr[i] + " in given array is: " + count[i]);
            }
        }
    }
}
