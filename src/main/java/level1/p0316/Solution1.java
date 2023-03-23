package level1.p0316;

public class Solution1 {

    //로또의 최고 순위와 최저 순위
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;    //맞춘 번호
        int unknown = 0;    //요소가 0인 경우

        for(int num : lottos){
            if(num == 0) unknown++;
        }//for end

        for(int i=0; i< win_nums.length; i++){
            for(int j=0; j< lottos.length; j++){
                if(win_nums[i] == lottos[j]) correct++;
            }
        }//for end

        answer[0] = correct + unknown;  //최대로 맞췄을 경우
        answer[1] = correct;            //최소로 맞췄을 경우

        for(int i=0; i<2; i++){
            switch (answer[i]){
                case 6 : answer[i] = 1; break;
                case 5 : answer[i] = 2; break;
                case 4 : answer[i] = 3; break;
                case 3 : answer[i] = 4; break;
                case 2 : answer[i] = 5; break;
                case 1 :
                case 0 : answer[i] = 6; break;
            }//switch() end
        }//for end

        return answer;
    }

}//class end
