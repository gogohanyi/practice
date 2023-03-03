package p0303;

public class Solution3 {

    //콜라츠 추측
    public int solution(int num) {
        int answer = 0;

        if(num == 1){   //num이 1일 때 0반환
            answer = 0;
        }else{

            while (answer <= 500){
                answer++;   //반복 횟수

                if (num%2 == 0){
                    num /= 2;
                }else if (num%2 == 1){
                    num = num*3 + 1;
                }//if end

                if(num == 1) break; //num이 1이되면 break

            }//while() end
        }//if end

        if(num != 1) answer = -1;  //500회 이상 반복이면 -1 반환

        return answer;
    }//solution() end

}//class end
