package level1.p0314;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    //소수 만들기
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i< nums.length-2; i++){
            for(int j=i+1; j< nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                  int x = nums[i] + nums[j] + nums[k];
                  list.add(x);
                }
            }
        }//for end

        for(int i=0; i<list.size(); i++){
            //System.out.print(list.get(i) + ", ");
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(list.get(i)); j++){
                if(list.get(i)%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }//for end

        return answer;
    }
}//class end
