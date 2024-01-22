class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        for(int i =0; i < arr.length; i++){
            switch(arr[i]){
                case 'w' -> answer++;
                case 's' -> answer--;
                case 'd' -> answer += 10;
                case 'a' -> answer -= 10;
            }
        }
        return answer;
    }
}