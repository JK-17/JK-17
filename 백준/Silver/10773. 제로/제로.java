import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Stack<Integer> arr = new Stack<>();
        int temp;
        for(int i = 0; i < N; i++){
            temp = Integer.parseInt(sc.nextLine());
            if(temp != 0) arr.push(temp);
            else arr.pop();
        }

        System.out.println(arr.stream().reduce(0, (p, c) -> p+c));

    }
}
