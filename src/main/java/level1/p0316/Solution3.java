package level1.p0316;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Solution3 {

    //숫자 짝꿍
    public String solution(String X, String Y) {

        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(String x : X.split("")){
            arrX[Integer.parseInt(x)]++;
        }

        for(int i=0; i<Y.length(); i++){
            arrY[Integer.parseInt(Y.substring(i, i+1))]++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i=9; i>=0; i--){
            while(arrX[i] > 0 && arrY[i] > 0){
                answer.append(i);
                arrX[i]--;
                arrY[i]--;
            }
        }//for end

        //짝이 없는 경우 "-1", 빈 경우 "0" 리턴.
        if(answer.toString().equals("")){
            return "-1";
        } else if (answer.toString().substring(0, 1).equals("0")) {
            return "0";
        }//if end

        return answer.toString();
    }

    //숫자 짝꿍 (시간 초과 에러)
    public String solution1(String X, String Y) {

        //문자열을 int 배열로 변환.
        int[] arrX = Stream.of(X.split("")).mapToInt(Integer::parseInt).toArray();
        int[] arrY = Stream.of(Y.split("")).mapToInt(Integer::parseInt).toArray();

        List<Integer> list = new ArrayList<>();   //짝 찾아서 list에 담기

        for(int i=0; i<arrX.length; i++){
            for(int j=0; j<arrY.length; j++){
                if(arrX[i] == arrY[j]){
                    list.add(arrX[i]);
                    arrX[i] = -1;
                    arrY[j] = -1;
                }
            }
        }//for end

        while (list.remove(Integer.valueOf(-1))){}
        Collections.sort(list, Collections.reverseOrder());  //내림차순 정렬

        //짝이 없는 경우 "-1" 리턴.
        if(list.isEmpty()){
            return "-1";
        } else if (list.get(0) == 0) {
            return "0";
        }


        StringBuilder answer = new StringBuilder();
        for(int num : list){
            if(num >= 0) {
                answer.append(num);
            }
        }

        return answer.toString();
    }//solution1() end
}//class end
