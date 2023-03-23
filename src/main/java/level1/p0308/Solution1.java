package level1.p0308;

public class Solution1 {

    //행렬의 덧셈
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i< arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }//for end

        return answer;
    }//solution() end

}//class end
