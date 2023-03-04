package p0304;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution4 {

    //배열에서 제일 작은 수 제거하기
    public int[] solution(int[] arr) {

        //arr 배열의 길이가 1일 때
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        //최솟값 구하기
        /*
        int min = arr[0];
        int x = 0;          //최솟값 갖는 인덱스
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                x = i;
            }
        }
        */

        //arr 배열 List로 변환
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }

        list.remove(Collections.min(list));   //최솟값 삭제
        //list.remove(x);

        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }//for end

        /*
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min == arr[i]) { // 제일 작은 수와 일치한다면 계속, 아니면 answer배열에 담기
                continue;
            }
            answer[index++] = arr[i];
        }
        */

        return answer;
    }//solution() end



    //에러
    public int[] solution1(int[] arr) {

        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        int min = arr[0];   //최소값
        int x = 0;          //최소값 인덱스
        for(int i=0; i< arr.length; i++){
            if(arr[i] < min) min = arr[i];
            x = i;
        }

        //arr 배열을 문자열로 치환
        String str = "";
        for(int i=0; i<arr.length; i++){
            str += arr[i];
        }
        String str1 = str.substring(0, x);
        String str2 = str.substring(x, str.length()-1);
        str = str1 + str2;

        int[] answer = new int[arr.length-1];
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(str.substring(i, i+1));
        }

        return answer;
    }//solution1() end

}//class end
