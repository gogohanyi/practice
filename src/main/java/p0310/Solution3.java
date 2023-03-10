package p0310;

public class Solution3 {

    //비밀지도
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        //배열 요소 2진수로 변환
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }//for end

        //문자 치환
        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }//for end
        
        return answer;
    }//solution() end

}//class end
