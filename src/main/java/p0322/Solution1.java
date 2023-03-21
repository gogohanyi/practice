package p0322;

import java.util.Arrays;

public class Solution1 {

    //최대값과 최소값
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        Integer[] nums = new Integer[arr.length];

        for(int i=0; i<arr.length; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }//for end

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        answer = min + " " + max;

        return answer;
    }

}//class end
