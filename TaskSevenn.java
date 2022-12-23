import java.util.*;

public class TaskSevenn {
    public static void main(String[] args) {

        int[] arr = {4, 6, 1, 2, 1, 2, 3, 2, 3, 2, 3, 7, 4, 1, 5, 1, 5, 6};
        System.out.println();
        int[] arr2 = {-1, -2, 2, 1, 2, 3, 1, 5, 7, 0, -1, 1, 7, 5, 7, 6};
        System.out.println();
        int[] arr3 = {1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        System.out.println();
        int[] arr4 = {3, 4, 5, 3, 5, 3, 7, 8, 7, 8, 7, 9, 5, 3, 5, 3, 6, 5, 7, 8, 6, 9, 8};
        System.out.println();
        int[] arr5 = {17, 13, 19, 5, 19, 5, 6, 4, 20, 8, 7, 8, 7, 13, 14, 13, 14, 13, 14, 13, 14, 54, 65, 54, 65};
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int n = 9;
        int[] array = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int number = map.get(arr[i]);
                map.replace(arr[i], number + 1);
            }
        }
        int max = 0;

        for (int i : map.values()) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
