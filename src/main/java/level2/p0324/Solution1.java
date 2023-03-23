package level2.p0324;

public class Solution1 {

    //다음 큰 숫자
    public int solution(int n) {
        int answer = n + 1;

        while (true){
            if(Integer.bitCount(n) == Integer.bitCount(answer)){
                break;
            }
            answer++;
        }//while() end
        return answer;
    }
}//class end
