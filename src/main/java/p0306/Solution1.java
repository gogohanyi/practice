package p0306;

public class Solution1 {

    //없는 숫자 더하기
    public int solution(int[] numbers) {

        //1~9까지 더하기
        int sum = 0;
        for(int i=1; i<=9; i++){
            sum += i;
        }

        //numbers 배열 요소의 합
        int x = 0;
        for(int element : numbers){
            x += element;
        }

        return sum - x;
    }//solution() end

}//class end
