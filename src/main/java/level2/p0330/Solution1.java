package level2.p0330;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {

    //귤 고르기
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : tangerine){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());  //사이즈별 keyList 생성
        keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));  //내림차순 정렬

        int i = 0;
        while (k > 0){
            k -= map.get(keyList.get(i));
            i++;
            answer++;
        }//while() end
        return answer;
    }
}//class end
