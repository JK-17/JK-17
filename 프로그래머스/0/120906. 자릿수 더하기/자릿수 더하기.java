class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = n + "";
        char[] arr = num.toCharArray();
        for(int i = 0; i < arr.length; i++) answer += Character.getNumericValue(arr[i]);
        return answer;
    }
}