package p0308;

public class Solution3 {

    //최대공약수, 최소공배수 구하기
    public int[] solution(int n, int m) {

        int g = 0;  //최대공약수
        int l = 0;  //최소공배수
        int multi = n*m;

        if(n < m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        //최대공약수 g
        while (m != 0){
            int x = n%m;
            n = m;
            m = x;
        }//while() end
        g = n;

        //최소공배수 l
        l = multi / g;

        int[] answer = {g, l};

        return answer;
    }//solution() end

}//class end
