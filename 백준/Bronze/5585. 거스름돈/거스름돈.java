import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = 1000;
        int[] changes = {500, 100, 50,10, 5, 1};

        int answer = 0;
        int change = bill - sc.nextInt();
        int i = 0;
        int howmany;
        while (change > 0) {
            if(change < changes[i]){
                i++;
            }else{
                howmany = change / changes[i];
                change -= changes[i] * howmany;
                answer+=howmany;
            }
        }
        System.out.println(answer);
    }
}