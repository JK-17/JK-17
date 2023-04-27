class Solution {
    public int solution(int n) {
        int[] F = new int[n+1];
        int answer = 0;
        F[0] = 0;
        F[1] = 1;
        
        for(int i = 2; i <= n; i++){
            F[i] = (F[i-1]%1234567 + F[i - 2]%1234567)%1234567;
        }
        
        answer = F[n]%1234567;
        return answer;
    }
    
  
}