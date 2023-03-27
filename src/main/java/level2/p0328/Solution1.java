package level2.p0328;

public class Solution1 {

    //예상 대진표
    public int solution(int n, int a, int b) {
        int answer = 0;

        while(a != b){

            a = (a+1)/2;
            b = (b+1)/2;

            answer++;
        }//while() end

        return answer;
    }
}//class end
