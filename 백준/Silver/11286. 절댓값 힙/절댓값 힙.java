import java.util.*;
import java.io.*;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, NumberFormatException {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  int N = Integer.parseInt(br.readLine());

  //이 선언하는 방법 상당히 중요한거 같음
  PriorityQueue<Integer> que = new PriorityQueue<>((o1,o2) -> {
    
    int first_abs = Math.abs(o1);
    int second_abs = Math.abs(o2);
    if(first_abs == second_abs){
      return o1 > o2 ? 1 : -1; //절대값이 같은 경우 음수 우선
    }
    return first_abs - second_abs;//절대값이 작은 데이터 우선
  });

  for(int i = 0; i < N; i++){
    int num = Integer.parseInt(br.readLine());
    if(num == 0){
      if(que.isEmpty()){
        System.out.println('0');
      }else{
        System.out.println(que.poll());
      }
    }else{
      que.add(num);
    }
  }
  }
}