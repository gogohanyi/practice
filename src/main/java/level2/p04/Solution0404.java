package level2.p04;

import java.util.HashMap;

public class Solution0404 {

    //위장
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        //의상 종류별 개수 카운트
        for(int i=0; i< clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }

        //경우의 수 구하기
        for(String key : map.keySet()){
            answer *= map.get(key);
        }

        return answer - 1;
    }
}
