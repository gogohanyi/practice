package p0308;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    //같은 숫자는 싫어
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            if(i>=1){
                if(arr[i] == arr[i-1]){
                    continue;
                }
            }//if end
            list.add(arr[i]);
        }//for end

        answer = new int[list.size()];
        for (int i=0; i< answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}//class end
