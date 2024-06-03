import java.util.Scanner;

public class spanOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];

            }

        }
        int spanOfArray = max - min;
        System.out.println(spanOfArray);

    }
}
