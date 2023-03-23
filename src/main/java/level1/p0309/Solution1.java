package level1.p0309;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    //3진법 뒤집기
    public int solution(int n) {

        String x = Integer.toString(n, 3); //n을 3진법 변환
        //System.out.println(x);

        //3진수 x를 배열로 변환해서 마지막 요소부터 list에 담기
        String[] arr = x.split("");
        List<String> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list.add(arr[arr.length - 1 - i]);
        }

        String answer = "";
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }

        return Integer.parseInt(answer, 3);
    }

}//class end
