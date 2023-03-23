package level1.p0301;

public class Solution4 {

    //정수 제곱근 판별
    public long solution(long n) {

        long x = (long)Math.sqrt(n);    //n의 제곱근

        if(Math.pow(x, 2) == n){        //x의 제곱과 n이 같다면
            return (long)Math.pow(x+1, 2);
        }else{
            return -1;                  //다르면 -1 리턴
        }//if end

    }//solution() end


    public static void main(String[] args) {
        System.out.println(Math.sqrt(143));
    }

}//class end
