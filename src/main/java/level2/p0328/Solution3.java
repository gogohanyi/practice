package level2.p0328;

public class Solution3 {

    //N개의 최소공배수
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=1; i<arr.length; i++){
            int gcd = gcd(answer, arr[i]);      //최대공약수
            answer = (answer * arr[i]) / gcd;   //최소공배수
        }

        return answer;
    }//solution() end

    //최대공약수 구하기
    public static int gcd(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);

        while (x % y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return y;
    }//gcd() end
}//class end
