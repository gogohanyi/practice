package level2.p0329;

import java.util.Stack;

public class Solution3 {

    //괄호 회전하기
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i) + s.substring(0, i);

            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);

                if(stack.isEmpty()){
                    stack.push(c);
                } else if (c == ']' && stack.contains('[')) {
                    stack.pop();
                } else if (c == ')' && stack.contains('(')) {
                    stack.pop();
                } else if (c == '}' && stack.contains('{')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }//if end
            }//for end
            if (stack.isEmpty()) answer++;
        }//for end

        return answer;
    }

}//class end
