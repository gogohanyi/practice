package p0303;

public class Solution2 {

    //하샤드 수 구하기
    public boolean solution(int x) {
        boolean answer = true;

        //자릿수 더하기
        int sum = 0;
        int i = x;
        while(i > 0){
            sum += i%10;
            i /= 10;
        }//while() end

        //x가 자릿수 합으로 나누어 떨어지는지
        if(x%sum != 0) answer = false;

        return answer;
    }//solution() end

}//class end
