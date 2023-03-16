package p0315;

import java.util.ArrayList;
import java.util.Collections;

public class Solution4 {

    //명예의 전당 (1)
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer>[] arr = new ArrayList[score.length];

        for(int i=0; i< score.length; i++){
            arr[i] = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                arr[i].add(score[j]);
            }
        }//for end

        /*
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].size(); j++){
                System.out.print(arr[i].get(j) + ", ");
            }
            System.out.println();
        }//for end
        */



        for(int i=0; i<answer.length; i++){
            answer[i] = Collections.min(arr[i]);
        }

        return answer;
    }
}//class end
