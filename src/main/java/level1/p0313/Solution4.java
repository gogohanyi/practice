package level1.p0313;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {

    //폰켓몬
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length/2;

        List<Integer> list = new ArrayList<>(); //nums 배열에서 중복되는 요소 제거
        for(int num : nums){
            if(!list.contains(num)) list.add(num);
        }//for end

        if(list.size() > size){
            answer = size;
        }else {
            answer = list.size();
        }//if end

        return answer;
    }

}//class end
