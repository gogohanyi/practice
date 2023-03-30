package level2.p0329;

import java.util.Arrays;

public class Solution2 {

    //H-Index
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); //오름차순 정렬

        for(int i=0; i<citations.length; i++){
            int x = citations.length - i;   //전체 논문 개수(순번)
            if(citations[i] >= x) {         //인용 횟수가 더 크다면 x 반환
                answer = citations.length - i;
                break;
            }
        }

        return answer;
    }
}//class end
