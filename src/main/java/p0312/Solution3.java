package p0312;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {

    //두 개 뽑아서 더하기
    public int[] solution(int[] numbers) {
        int[] answer = {};

        //요소 두 개 더해서 list에 담기
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }//for end

        //중복되는 값 지운 list
        List<Integer> result = new ArrayList<>();
        for(int num : list){
            if(!result.contains(num)){
                result.add(num);
            }
        }//for end

        //answer 배열에 담기
        answer = new int[result.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }

        Arrays.sort(answer);    //오름차순 정렬

        return answer;
    }
}//class end
