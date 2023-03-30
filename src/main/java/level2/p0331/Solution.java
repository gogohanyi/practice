package level2.p0331;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    //튜플
    public int[] solution(String s) {

        s = s.substring(1, s.length()-1);          //바깥 괄호 삭제
        s = s.replace("{", "");   //"{" 괄호 삭제

        String[] arr = s.split("}");         //"}" 기준으로 배열로 자르기

        //배열 원소의 길이를 기준으로 오름차순 정렬
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String[] tmp = arr[i].split(",");          //각 원소를 , 로 구분
            for(int j=0; j< tmp.length; j++){
                try {
                    Integer num = Integer.parseInt(tmp[j]);  //숫자라면
                    if(!list.contains(num)) list.add(num);   //list에 담기
                }catch (Exception e){
                    continue;
                }
            }
        }//for end

        //Integer형 list를 int 배열로 변환
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}//class end
