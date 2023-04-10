import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();

    int[] arr = new int[N];
    int[] sum = new int[N+1];
    int a = 0;
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
      a  += arr[i];
      sum[i+1] = a;
    }

    int s,e;
    int[] ans = new int[A];

    for(int i = 0; i < A; i++){
      s = sc.nextInt();
      e = sc.nextInt();

      ans[i] = sum[e] - sum[s-1];
    }

    for(int i = 0; i < A; i++){
      System.out.println(ans[i]);
    }

  }
}
