package level1.p0321;

public class Solution2 {

    //키패드 누르기
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;  //* 위치
        int right = 12; //# 위치

        for(int i=0; i< numbers.length; i++){
            int n = numbers[i];
            if(n == 1 || n == 4 || n == 7){
                left = n;
                sb.append("L");
            } else if (n == 3 || n == 6 || n == 9) {
                right = n;
                sb.append("R");
            }else {
                if(n == 0) n = 11;  //0 위치

                int leftDiff = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;     //왼손에서의 거리
                int rightDiff = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;  //오른손에서의 거리

                if(leftDiff == rightDiff){      //거리가 같을 때 hand 변수로 조건 분기
                    if(hand.equals("left")){
                        left = n;
                        sb.append("L");
                    }else{
                        right = n;
                        sb.append("R");
                    }
                } else if (leftDiff > rightDiff) {
                    right = n;
                    sb.append("R");
                }else {
                    left = n;
                    sb.append("L");
                }//if end
            }//if end
        }//for end

        return sb.toString();
    }
}//class end
