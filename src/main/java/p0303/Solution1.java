package p0303;

public class Solution1 {

    //두 정수 사이의 합
    public long solution(int a, int b) {

        long answer = 0;

        if(a == b){     //a와 b가 같을 때
            answer = (long)a;
        } else {
            if(a > b){  //a>b일 때 수 바꿔주기
                int temp = b;
                b = a;
                a = temp;
            }//if end

            for(int i=a; i<=b; i++){
                answer += i;
            }//for end

        }//if end

        return answer;
    }//solution() end

}//class end
