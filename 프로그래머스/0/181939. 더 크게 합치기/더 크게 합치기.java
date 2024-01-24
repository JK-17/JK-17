class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a + "" + b;
        String ba = b + "" + a;
        
        
        return Integer.parseInt(ab) >= Integer.parseInt(ba) ? Integer.parseInt(ab) : Integer.parseInt(ba);
    }
}