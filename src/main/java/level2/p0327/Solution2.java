package level2.p0327;

public class Solution2 {

    //카펫
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;        //전체 면적

        for(int i=3; i<=area; i++){
            int height = i;               //세로
            int width = area / height;    //가로

            if(height > width) continue;  //세로가 더 길면 패스

            if((width - 2) * (height - 2) == yellow){
                answer[0] = width;
                answer[1] = height;
                break;
            }//if() end
        }//for() end
        return answer;
    }
}//class end
