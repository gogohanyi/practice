package p0301;

public class Solution2 {

    //자연수 뒤집어 배열로 만들기
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split(""); //n을 배열 arr로 변환하여 선언
        int[] answer = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[arr.length-i-1]);  //arr을 정수형 변환 후 answer에 대입
        }//for end

        return answer;
    }//solution() end
}//class end
