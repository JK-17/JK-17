import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Queue<Integer> que = new LinkedList<>();
    int N = sc.nextInt();

    for(int i = 0; i<N; i++){
      que.add(i+1);
    }

    while(que.size() > 1){
      que.poll();
      que.add(que.poll());
    }
    System.out.println(que.poll());
  }
}
