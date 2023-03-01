package p0301;

public class Solution1 {

    //자릿수 더하기
    public int solution(int n){
        int answer = 0;

        while(n>0){
            answer += n%10;
            n /= 10;
        }//while() end

        return answer;
    }//solution() end

}//class end
