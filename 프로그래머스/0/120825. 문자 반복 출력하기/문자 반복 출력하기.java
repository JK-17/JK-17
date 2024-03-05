class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char i : my_string.toCharArray()){
            answer += Character.toString(i).repeat(n);
        }
        return answer;
    }
}