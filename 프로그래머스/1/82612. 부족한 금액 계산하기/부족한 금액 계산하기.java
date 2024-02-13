class Solution {
    public long solution(int price, int money, int count) {
        long[] sum = new long[count];
        sum[0] = price;
        for(int i = 1; i < count; i++) sum[i] = price * (i+1) + sum[i-1];
        if(money < sum[count-1]) return sum[count-1] - money;
        else return 0;
    }
}