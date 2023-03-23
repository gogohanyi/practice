package level1.p0307;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

    //문자열 내림차순으로 배치 (대문자는 소문자보다 작은 것으로 간주)
    public String solution(String s) {
        String[] arr = String.valueOf(s).split("");   //s 문자열 char 배열로 변환

        Arrays.sort(arr, Collections.reverseOrder());       //내림차순 정렬

        StringBuilder str = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            str.append(arr[i]);
        }

        return str.toString();
    }//solution() end

}//class end
