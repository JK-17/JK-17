import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean end = true;
    int n = sc.nextInt();
    int [] arr2 = new int[n];
    for(int i = 0; i < n; i++){
      arr2[i] = sc.nextInt();
    }
    Stack<Integer> stack = new Stack<>();
    ArrayList<String> ans = new ArrayList<>();
    int num = 1;
  for(int i = 0; i < n; i ++){
    if(arr2[i] >= num){
      while(arr2[i] >= num){
        stack.push(num);
        num++;
        ans.add("+");
      }
      stack.pop();
      ans.add("-");

    }else{
      int num2 = stack.pop();
      if(num2 > arr2[i]){
        System.out.println("NO");
        end = false;
        break;
      }else{
        ans.add("-");
      }
    }
  }

  if(end){
    for(String i:ans){
      System.out.println(i);
    }
  }
  }
}