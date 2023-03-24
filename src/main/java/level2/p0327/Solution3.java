package level2.p0327;

import java.util.Arrays;

public class Solution3 {

    //구명보트
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int idx =0; //오름차순 인덱스 (최솟값)
        for(int i = people.length-1; i >= idx; i--){
            if(people[i] + people[idx] <= limit){
                answer++;
                idx++;
            }else {
                answer++;
            }
        }//for() end

        return answer;
    }
}//class end
