import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        char first = input.charAt(0);
        int count =0;

        for(int i = 1; i < input.length(); i++){
            count++;
            if(first != input.charAt(i)){
                if(first == '0') zeros.add(count);
                else ones.add(count);
                first =  input.charAt(i);
                count = 1;
            }
            if(i == input.length()-1){
                if(first == '0') zeros.add(count);
                else ones.add(count);
            }
        }// end for



        System.out.println(zeros.size() > ones.size() ? ones.size() : zeros.size());
    }
}
