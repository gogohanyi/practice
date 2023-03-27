package level2.p0328;

public class Solution2 {

    //점프와 순간 이동
    public int solution(int n) {
        int ans = 0;

        while (n >= 1){
            if(n % 2 == 0){ //n이 짝수면 순간 이동 2로 나누어 떨어짐
                n /= 2;
            }else {
                ans++;      //n이 홀수면 점프로 짝수로 만들어주고 다시 순간 이동
                n = (n - 1)/2;
            }//if end

            if(n == 1) {    //n이 1인 경우 점프만 가능
                ans++;
                break;
            }
        }//while() end

        return ans;
    }
}//class end
