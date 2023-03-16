package p0315;

import java.util.Arrays;
import java.util.Collections;

public class Solution2 {

    //과일 장수
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        //int배열 Integer 배열로 박싱하여 내림차순
        score = Arrays.stream(score)
                .boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();

        int size = score.length - (score.length%m);

        int index = 0;
        int n = size;

        while (n > 0){
            answer += score[index + m - 1] * m;
            n -= m;
            index += m;
        }//while() end

        return answer;
    }
}//class end
