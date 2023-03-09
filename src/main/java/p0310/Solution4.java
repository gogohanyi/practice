package p0310;

import java.util.Arrays;

public class Solution4 {

    //문자열 내 마음대로 정렬하기
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        //n번째 문자를 요소의 맨 앞에 추가하기
        for(int i=0; i<answer.length; i++){
            answer[i] = strings[i].substring(n, n+1) + strings[i];
        }//for end

        Arrays.sort(answer);    //오름차순 정렬

        for(int i=0; i<answer.length; i++){
            answer[i] = answer[i].substring(1); //추가한 맨 앞 문자 삭제
        }//for end

        return answer;
    }

}//class end
