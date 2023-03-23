package level1.p0313;

public class Solution2 {

    //푸드 파이트 대회
    public String solution(int[] food) {

        String x = "";
        String y = "";

        for(int i=1; i<food.length; i++){
            int each = food[i]/2;
            for(int j=1; j<=each; j++){
                x = x + i;
                y = i + y;
            }
        }//for end

        return x + 0 + y;
    }
}//class end
