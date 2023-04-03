import java.util.Scanner;

public class Java2DArray {

    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int maxHourglassSum = calculateMaxHourglassSum(arr);
        System.out.println(maxHourglassSum);
    }

    /**
     * Calculates the maximum hourglass sum in a given 2D array.
     *
     * @param arr the 2D array
     * @return the maximum hourglass sums
     */
    private static int calculateMaxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < ARRAY_SIZE - 2; i++) {
            for (int j = 0; j < ARRAY_SIZE - 2; j++) {
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int middle = arr[i + 1][j + 1];
                int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                int hourglassSum = top + middle + bottom;
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }
        return maxSum;
    }
}

