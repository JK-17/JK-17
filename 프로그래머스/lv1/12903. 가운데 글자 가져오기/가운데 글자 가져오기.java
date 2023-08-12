class Solution {
    public String solution(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        boolean a = length%2 == 0;
        String answer = "";
        if(a){
          answer += arr[length/2-1];
          answer += arr[length/2];  
        }else{
            answer += arr[length/2];
        }
        
        return answer;
    }
}