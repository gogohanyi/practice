package p0314;

public class Solution1 {

    //가장 가까운 같은 글자
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        String[] str = s.split("");   //s 문자열 배열로 자르기
        for(int i=0; i< str.length; i++){

            answer[i] = -1;                 //answer 요소 -1로 초기화

            for(int j=0; j<i; j++){
                if(!str[i].equals(str[j])){
                    continue;
                }else {
                    answer[i] = i - j;
                }
            }//for end

        }//for end

        return answer;
    }

}//class end
