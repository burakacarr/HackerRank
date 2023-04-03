import java.util.Scanner;

public class JavaSubArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // Calculate the number of subarrays with negative sum
        int count = countSubarraysWithNegativeSum(arr);
        System.out.println(count);
    }

    private static int countSubarraysWithNegativeSum(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Calculate the sum of all subarrays and count the negative ones
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

