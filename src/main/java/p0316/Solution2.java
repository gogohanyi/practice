package p0316;

import java.util.Arrays;

public class Solution2 {

    //체육복
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;
        int stolen = lost.length; //도난 체육복 수
        int borrow = 0;           //빌려줄 수 있는 체육복 수

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복이 있는데 도난 당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    stolen--;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }//for end

        //여벌 체육복을 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]== reserve[j] + 1 || lost[i] == reserve[j] - 1){
                    borrow++;
                    reserve[j] = -1;
                    break;
                }
            }
        }//for end

        answer = n - stolen + borrow;   //정원 - 도난 수 + 빌려준 수
        return answer;
    }
}//class end
