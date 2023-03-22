package p0323;

import java.util.Stack;

public class Solution1 {

    //올바른 괄호
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // '(' 경우
            if(c == '('){
                stack.push(c);
            }
            // ')' 경우
            else {
                if(stack.size()==0){    //앞에 맞는 짝( 왼쪽 괄호가 없으므로 false
                    return false;
                }else {
                    stack.pop();
                }
            }//if end

        }//for end

        if(stack.size() != 0) return false;
        return answer;
    }
}//class end
