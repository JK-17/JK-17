import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < names.length; i+=5) answer.add(names[i]);
        String[] temp = new String[answer.size()];
        return answer.toArray(temp);
    }
}