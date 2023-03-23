package level1.p0314;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    //모의고사
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] counts = {0, 0, 0};   //수포자들 점수 count

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5]) counts[0]++;
            if(answers[i] == b[i%8]) counts[1]++;
            if(answers[i] == c[i%10]) counts[2]++;
        }//for end

        int max = 0;    //최대 점수 구하기
        for(int i=0; i<counts.length; i++){
            if(counts[i] > max) max = counts[i];
        }//for end

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<counts.length; i++){
            if(max == counts[i]) list.add(i+1);
        }

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}//class end
