package level1.p0304;

import java.util.Arrays;

public class Solution1 {

    //나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;

        //나누어 떨어지는 요소 count
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0) count++;
        }// for end

        //나누어 떨어지는 숫자가 하나도 없을 때
        if(count == 0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[count];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0) answer[index++] = arr[i];   //answer 배열에 나눠 떨어지는 요소 대입
        }//for end

        Arrays.sort(answer);    //오름차순 정렬
        return answer;
    }//solution() end

}//class end
