package level1.p0320;

public class Solution1 {

    //기사 단원의 무기
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++){
            int cnt = 0;    //약수 카운트

            for(int j=1; j*j<=i; j++){
                if(j*j == i){
                    cnt++;
                }else if (i%j == 0){
                    cnt += 2;
                }//if end
            }//for end

            answer += cnt > limit ? power : cnt;    //limit 조건
        }//for end

        return answer;
    }//solution() end
}//class end
