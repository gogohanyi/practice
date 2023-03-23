package level1.p0315;

import java.util.ArrayList;
import java.util.Collections;

public class Solution4 {

    //명예의 전당 (1)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i< score.length; i++){
            arr.add(score[i]);                              //ArrayList에 점수 추가
            if(i >= k) arr.remove(Collections.min(arr));    //개수가 k를 넘어가면 list 최소값 삭제
            answer[i] = Collections.min(arr);               //가장 작은 요소를 answer 배열에 저장
        }//for end

        return answer;
    }
}//class end
