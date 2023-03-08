package p0309;

import java.util.Arrays;

public class Solution4 {

    //예산
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);     //d배열 오름차순 정렬
        int sum = 0;        //지원 금액

        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget) break;     //예산을 넘으면 반복 그만.
            answer ++;
        }//for end

        return answer;
    }

}//class end
