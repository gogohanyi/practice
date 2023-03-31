package level2.p04;

import java.util.Arrays;

public class Solution0403 {

    //n^2 배열 자르기
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        int idx = 0;
        for(long i = left; i < right + 1; i++){
            answer[idx++] = (int)Math.max(i % n, i / n) + 1;
        }//for end

        return answer;
    }


    //메모리 초과 에러
    public int[] solution1(int n, long left, long right) {

        //2차원 배열 만들기
        int[][] tmp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                tmp[i][j] = Math.max(i, j) + 1;
            }
        }//for end

        //2차원 배열의 요소를 1차원 배열에 넣기
        int[] answer = new int[tmp.length * tmp[0].length];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                answer[tmp[i].length * i + j] = tmp[i][j];
            }
        }

        //배열 자르기
        answer = Arrays.copyOfRange(answer, (int)left, (int)right);

        return answer;
    }
}
