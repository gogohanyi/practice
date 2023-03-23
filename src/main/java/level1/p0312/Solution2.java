package level1.p0312;

import java.util.Arrays;

public class Solution2 {

    //k번째 수
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){

            int[] tmps = new int[commands[i][1] - commands[i][0] + 1];  //i ~ k번째 까지 자른 배열 선언
            for(int j=0; j< tmps.length; j++){
                tmps[j] = array[j + commands[i][0] - 1];
            }//for end
            Arrays.sort(tmps);  //오름차순 정렬
            answer[i] = tmps[commands[i][2] - 1];   //세번째 요소 추출

        }//for end

        return answer;
    }//solution() end
}//class end
