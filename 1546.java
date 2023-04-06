import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.nextLine();

    int[] grades = new int[input];
    for(int i = 0; i < input; i++){
      grades[i] = sc.nextInt();
      sc.nextLine();
    }

    int max = 0;
    for(int i : grades){
      if(i > max){
        max = i;
      }
    }

    int sum = 0;
    for(int i = 0; i < input; i++){
      sum = (grade[i]/max) * 100;
    }

      System.out.println(sum/input);
  }
}
