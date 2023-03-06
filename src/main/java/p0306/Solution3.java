package p0306;

public class Solution3 {

    //수박수박수박수
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                answer.append("수");
            }else {
                answer.append("박");
            }
        }//for end

        return answer.toString();
    }//solution() end

}//class end
