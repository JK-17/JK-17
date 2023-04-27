import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean check = false;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    check = true;
                    break;
                }
            }
            if(check){
                check = false;
            }else{
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}