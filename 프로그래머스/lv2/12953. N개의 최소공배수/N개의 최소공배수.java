class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        if(arr.length == 1) return arr[0];
        
        int num = gdc(arr[0], arr[1]);
        answer = arr[0] * arr[1] / num;
        
        if(arr.length > 2){
             for(int i = 2; i < arr.length; i++) {
                num = gdc(answer, arr[i]);
                answer = (answer * arr[i]) / num;
            }
        }
        
        
        
        return answer;
    }
    
    static int gdc(int a, int b){
        int r = a%b;
        if(r==0) return b;
        else return gdc(b,r);
    }
}