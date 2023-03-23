package level1.p0321;

import java.util.Stack;

public class Solution3 {

    //크레인 인형뽑기 게임
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(int m : moves){
            for(int i=0; i< board.length; i++){
                if(board[i][m-1] != 0){
                    if(!stack.empty() && stack.peek() == board[i][m-1]){    //Stack의 마지막 데이터와 같을 때
                        answer += 2;
                        stack.pop();    //마지막 데이터 삭제(꺼내기)
                        board[i][m-1] = 0;
                        break;
                    }else {
                        stack.push(board[i][m-1]);  //데이터 삽입
                        board[i][m-1] = 0;
                        break;
                    }//if end
                }//if end
            }//for end
        }//for end

        return answer;
    }

}//class end
