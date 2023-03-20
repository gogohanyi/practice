package p0321;

public class Solution1 {

    //옹알이 (2)
    public int solution(String[] babbling) {
        int answer = 0;

        for(String s : babbling){
            //같은 발음 제외
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")){
                continue;
            }//if() end

            //옹알이는 공백으로 치환
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");

            if(s.isBlank()) answer++;   //요소가 공백이면 카운트
        }//for end

        return answer;
    }
}//class end
