import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int match = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '(') match ++;
            if(s.charAt(i) == ')') match --;
            if(match < 0) break;
        }
        if(match == 0) answer = true;
        
        

        return answer;
    }
}