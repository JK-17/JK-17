import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int temp = 0;
        for (int price : d) {
            if (price <= budget) {
                budget -= price;
                temp += 1;
            }else {
                return temp;
            }
        }// end for
        return temp;
    }
}