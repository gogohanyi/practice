package p0323;

public class Solution3 {

    //숫자의 표현
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int sum = 0;

            for(int j=i; j<=n; j++){
                sum += j;
                if(sum == n){
                    answer++;
                } else if (sum > n) {
                    break;
                }//if() end
            }//for() end
        }//for() end

        return answer;
    }

}//class end
