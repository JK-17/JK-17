import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] buttons = {300, 60, 10};
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[3];
        int input = sc.nextInt();

        for(int i= 0; i < 3; i++){
            if(input < buttons[i]) continue;
            else {
                answer[i] = input / buttons[i];
                input -= buttons[i] * answer[i];
            }
        }

        if(input == 0){
            for (int i : answer) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println(-1);
        }
    }
}