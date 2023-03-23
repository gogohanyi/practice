package level1.p0315;

public class Solution3 {

    //1차 다트 게임
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int idx = 0;        //dart 배열 index
        String numStr = ""; //10점인 경우 1,0 붙여야 함

        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);

            //숫자일 때
            if('0' <= c && c <= '9'){
                numStr += c;
            }
            //보너스일 때
            else if (c == 'S' || c == 'D' || c == 'T') {
                int n = Integer.parseInt(numStr);
                if(c == 'S'){
                    dart[idx++] = (int)Math.pow(n, 1);  //1제곱
                } else if (c == 'D') {
                    dart[idx++] = (int)Math.pow(n, 2);  //2제곱
                }else {
                    dart[idx++] = (int)Math.pow(n, 3);  //3제곱
                }
                numStr = "";    //초기화
            }
            //옵션일 때
            else{
                if(c == '*'){
                    dart[idx-1] *= 2;
                    if(idx-2 >= 0) dart[idx-2] *= 2;
                }else if(c == '#'){
                    dart[idx-1] *= (-1);
                }
            }
        }//for end

        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}//class end
