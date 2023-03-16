package p0315;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution1 {

    //실패율
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] userCnt = new double[N+1];     //각 스테이지 도전자 수

        for(int i=1; i<=N+1; i++){
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i) userCnt[i-1]++;
            }
        }//for end

        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=0; j<userCnt.length; j++){
                sum += userCnt[j];
            }
            map.put(i+1, userCnt[i] / sum);
            sum = 0;
        }//for end


        //value 기준으로 내림차순 정렬
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));


        for(Integer key : keySetList) {
            System.out.println(key);
        }


        return answer;
    }
}//class end
