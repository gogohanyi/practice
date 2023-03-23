package level2.p0323;

public class Solution2 {

    //이진 변환 반복하기
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1){
            int cntOne = 0;         //1 개수

            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    answer[1]++;    //0 개수 카운트
                }else{
                    cntOne++;       //1 개수 카운트
                }
            }//for() end

            s = Integer.toBinaryString(cntOne); //1 개수(0을 지운 뒤의 길이) 이진 변환
            answer[0]++;                        //루프 카운트
        }//while() end

        return answer;
    }
}//class end
