import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 38;
        arr[1] = 38;
        arr[2] = 38;
        arr[3] = 38;
        arr[4] = 38;
           

        int [] two=arr;
        two[1]=24;    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}