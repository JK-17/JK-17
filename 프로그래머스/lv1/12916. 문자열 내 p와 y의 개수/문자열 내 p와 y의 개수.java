class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 'y') y++;
            else if(arr[i] == 'p') p++;
        }

        if(y == p) return true;
        else return false;
    }
}