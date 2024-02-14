import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++) arr1[i] = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++) arr2[i] = sc.nextInt();
        int answer = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < N; i++){
            answer += arr1[i] * arr2[N-1-i];
        }
        System.out.println(answer);
    }
}