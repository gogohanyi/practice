package level1.p0307;

public class Solution4 {

    //부족한 금액 계산하기
    public long solution(int price, int money, int count) {
        long answer = 0;

        //총 이용금액
        for(int i=1; i<=count; i++){
            answer += price * i;
        }

        //남은 금액
        answer = money - answer;

        return answer = answer < 0 ? -answer : 0 ;
    }//solution() end

}//class end
