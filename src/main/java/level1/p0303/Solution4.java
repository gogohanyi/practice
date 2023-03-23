package level1.p0303;

public class Solution4 {

    //seoul 배열에서 Kim 찾기
    public String solution(String[] seoul) {
        int x = 0;

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) x = i;   //요소가 Kim인 인덱스 찾아 x에 대입
        }//for end

        return "김서방은 " + x + "에 있다";
    }//solution() end

}//class end
