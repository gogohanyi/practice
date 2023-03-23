package level1.p0306;

public class Solution4 {

    //내적 : 길이가 같은 두 배열의 요소끼리 곱하기
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i] * b[i];
        }

        return answer;
    }

}//class end
