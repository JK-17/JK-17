import java.util.*;

class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    sc.nextLine();
    
    String sequence = sc.nextLine();
    char[] array = sequence.toCharArray();
    int sum = 0;
    for(int i = 0; i < input; i++){
      sum += Character.getNumericValue(array[i]);
    }
    System.out.println(sum);
  }
}