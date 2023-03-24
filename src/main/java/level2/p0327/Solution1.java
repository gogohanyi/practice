package level2.p0327;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    //영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for(int i=1; i< words.length; i++){

            //이미 나온 단어 or 끝말과 다른 단어 말한 경우
            if(list.contains(words[i]) || !words[i].substring(0,1).equals(words[i-1].substring(words[i-1].length()-1))){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                list.add(words[i]);     //list에 단어 추가
            }
        }//for() end

        return answer;
    }
}//class end
