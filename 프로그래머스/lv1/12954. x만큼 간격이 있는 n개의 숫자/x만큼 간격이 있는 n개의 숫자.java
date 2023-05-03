import java.util.*;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        long a = x;
        for(int i = 0; i <n; i++){
            answer.add(a);
            a += x;
        }
        return answer;
    }
}