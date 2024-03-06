import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(String x : intStrs) {
            if(Integer.parseInt(x.substring(s, s+l)) > k) answer.add(Integer.parseInt(x.substring(s, s+l)));
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}