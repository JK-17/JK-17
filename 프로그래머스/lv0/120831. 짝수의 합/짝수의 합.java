class Solution {
    public int solution(int n) {
        boolean val = (n > 0 && n <= 1000);
        int answer = 0;
        if(val) answer = add(n);
        return answer;
    }
    
    public int add(int n){
    int sum = 0;
    for(int i = 0; i <= n; i++){
        if(i%2 == 0) sum += i;
    }
    return sum;
}
}