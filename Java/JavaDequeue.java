import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int maxCount = 0;
        Map<Integer, Integer> windowMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // Add element at the end of the window
            int num = a[i];
            windowMap.put(num, windowMap.getOrDefault(num, 0) + 1);
            // Remove element at the beginning of the window
            if (i >= k) {
                int removeNum = a[i - k];
                int count = windowMap.get(removeNum);
                if (count == 1) {
                    windowMap.remove(removeNum);
                } else {
                    windowMap.put(removeNum, count - 1);
                }
            }
            // Update maximum count
            if (i >= k - 1) {
                maxCount = Math.max(maxCount, windowMap.size());
            }
        }
        System.out.println(maxCount);
    }
}

