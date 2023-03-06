package p0307;

public class Solution2 {

    //약수의 개수와 덧셈, 뻴셈
    public int solution(int left, int right) {
        int answer = 0;

        //주어진 숫자 배열로 초기화
        int[] nums = new int[right - left + 1];
        for(int i=0; i<nums.length; i++){
            nums[i] = left + i;
        }//for end

        //약수 카운트
        int cnt = 0;
        int[] cnts = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            cnt = 0;    //카운트 초기화
            for(int j=1; j<=nums[i]; j++){
                if(nums[i]%j == 0){
                    cnts[i] = ++cnt;
                }
            }
        }//for end

        for(int i=0; i<nums.length; i++){
            answer = cnts[i]%2 == 0 ? answer + nums[i] : answer - nums[i];
        }

        return answer;
    }//solution() end

}//class end
