class Solution {
    public int solution(int n, int k) {
        boolean val = (n > 0&& n < 1000 && k >= n/10 && k < 1000);
        int p = n/10;
        int answer = 0;
        if(val){
            answer = n*12000 + (k-p) * 2000;
        }
        return answer;
    }
}