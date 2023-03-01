package p0301;

import java.util.Arrays;

public class Solution5 {

    //정수 내림차순으로 배치하기
    public long solution(long n) {
        String str = Long.toString(n);          //n 문자열 형변환
        int[] arr = new int[str.length()];      //정수형 배열 선언
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));   //배열에 n 담기
            //System.out.print(arr[i]);
        }//for end

        //내림차순 정렬
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }//for end
        }//for end

        //배열 요소를 하나의 문자열로 합치기
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            answer.append(arr[i]);
        }

        return Long.parseLong(answer.toString());
    }//solution() end

    //메소드로 풀기
    public long solution2(long n){
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder answer = new StringBuilder();
        for (int i=0; i< arr.length; i++){
            answer.append(arr[i]);
        }

        return Long.parseLong(answer.reverse().toString());

    }//solution2() end

}//class end
