import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String[] str1 = str.split("-");
    int answer = 0;
    int temp;
    for(int i = 0; i < str1.length; i++){
      temp = Sum(str1[i]);
      if(i==0) answer += temp;
      else answer -= temp;
    }
    System.out.println(answer);
  }

  static int Sum(String a){
    String[] str = a.split("[+]");
    int b = 0;
    for(int i = 0; i < str.length; i++){
      b += Integer.parseInt(str[i]);
    }
    return b;
  }


}
