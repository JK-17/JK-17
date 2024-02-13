import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++) arr[i] = arr[i] + arr[i-1];
        int answer = 0;
        for (int i = 0; i < arr.length; i++) answer += arr[i];
        System.out.println(answer);
    }
}