package level2.p0324;

public class Solution2 {

    //피보나치 수
    public int solution(int n) {

        int[] num = new int[n];

        for(int i=0; i<n; i++){
            if(i == 0){
                num[i] = 0;
            }else if(i == 1) {
                num[i] = 1;
            }else {
                num[i] = (num[i-2] % 1234567) + (num[i-1] % 1234567);
            }
        }//for end

        int answer = (num[n-1] + num[n-2]) % 1234567;

        return answer;
    }
}//class end
