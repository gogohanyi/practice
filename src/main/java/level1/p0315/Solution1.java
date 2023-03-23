package level1.p0315;

import java.util.HashMap;

public class Solution1 {

    //실패율
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        int[] userCnt = new int[N];     //스테이지마다 남아있는 도전자 수
        int total = stages.length;      //총 도전자

        HashMap<Integer, Double> map = new HashMap<>();

        for(int i=0; i< stages.length; i++){
            if(stages[i] == N+1) continue;  //전체 스테이지 클리어 제외
            userCnt[stages[i] - 1]++;
        }//for end

        for(int i=0; i<userCnt.length; i++){
            if(total==0){
                map.put(i, 0d);
                continue;
            }
            map.put(i, (double)userCnt[i]/total);
            total -= userCnt[i];
        }//for end

        for(int i=0; i<N; i++){
            double max = 0;
            int maxKey = 0;

            for(int key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey + 1;
            map.remove(maxKey);
        }

        return answer;
    }
}//class end
