package p0310;

public class Solution2 {

    //최소 직사각형
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        int[][] arr = new int[sizes.length][2];

        //가로 세로 중 큰 값을 앞으로 가져오기
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            arr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
            System.out.println(arr[i][0] + ", " + arr[i][1]);
        }//for end

        //가로 중 제일 큰 값, 세로 중 제일 큰 값 추출
        for(int i=0; i< arr.length; i++){
            if(width < arr[i][0]) {width = arr[i][0];}
            if(height < arr[i][1]) {height = arr[i][1];}
        }//for end

        return width * height;
    }//solution() end

}//class end
