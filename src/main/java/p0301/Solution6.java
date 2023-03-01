package p0301;

public class Solution6 {

    //나머지가 1이되는 수 찾기
    public int solution(int n) {
        int answer = 1;

        //나머지 1이되는 answer 찾을 때 까지 반복 실행
        do {
            if (n%answer == 1) break;
            answer++;
        }while (answer<n);

        return answer;
    }//solution() end

}//class end
