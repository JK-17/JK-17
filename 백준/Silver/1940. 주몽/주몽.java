import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;

    int[] arr = new int[n];

    for(int i = 0; i < n; i ++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if (arr[i] + arr[j] == m){
          count++;
        }else if(arr[i] + arr[j] > m){
          break;
        }
      }
    }

    System.out.println(count);

  }
}
