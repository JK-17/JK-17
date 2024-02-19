import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] changes = {25, 10, 5, 1};
        int N = Integer.parseInt(sc.nextLine());
        int change;
        int[][] answer = new int[N][4];
        int j = 0;
        int howmany;

        for(int i =0; i < N; i++){
            change = Integer.parseInt(sc.nextLine());
            j = 0;
            while(change > 0){
                if(change < changes[j]) j++;
                else{
                    howmany = change/changes[j];
                    change -= changes[j] * howmany;
                    answer[i][j] = howmany;
                    j++;
                }
            }// end while
        }// end for

        for(int i = 0; i < answer.length; i++){
            for(int k = 0; k < answer[i].length; k++){
                System.out.print(answer[i][k] + " ");
            }
            System.out.println();
        }
    }
}

