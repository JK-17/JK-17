class Solution {
    public int solution(int n) {
        int answer = 3;
        
        for(int i = 2; i<=n; i++)
            if(n % i == 1) return i;
        
        return answer;
    }
}