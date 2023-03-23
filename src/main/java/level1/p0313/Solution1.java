package level1.p0313;

public class Solution1 {

    //콜라 문제
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;   //나머지 콜라

        while (true){
            if(n < a){ break; }
            answer += (n/a) * b;
            rest = n%a;
            n = (n/a)*b + rest;
            //System.out.println("result=" + answer + " / n=" + n);
        }//while()end

        return answer;
    }
}//class end
