package level1.p0304;

public class Solution3 {

    //음양 더하기
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        //마이너스 부호로 바꾸기
        for(int i=0; i<absolutes.length; i++){
            if (signs[i] == false) absolutes[i] = -absolutes[i];
        }

        //요소 더하기
        for(int i=0; i<absolutes.length; i++){
            answer += absolutes[i];
        }

        return answer;
    }

}//class end
