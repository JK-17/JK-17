class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] DP = new long[n+2];
        DP[0] = 0;
        DP[1] = 1;
        
        for(int i = 2; i <= n+1; i++){
            DP[i] = (DP[i-2] + DP[i-1]) % 1234567;
        }
        answer = DP[n+1];
        
        return answer;
    }
}