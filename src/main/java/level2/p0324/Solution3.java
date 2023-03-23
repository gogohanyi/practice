package level2.p0324;

import java.util.Stack;

public class Solution3 {

    //짝 지어 제거하기
    public int solution(String s) throws Exception{
        int answer = 1; //성공

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(i == 0){
                stack.push(c);
            }

            else{
                if(!stack.empty() && stack.peek() == c) {
                    stack.pop();
                }else {
                    stack.push(c);
                }//if end
            }
        }//for end

        if(stack.size() != 0) answer = 0;
        return answer;
    }

}//class end
