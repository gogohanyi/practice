package level2.p04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution0410 {

    //프린터
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : priorities){
            pq.offer(num);
        }

        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    answer++;
                    pq.poll();
                    if(i == location) break;
                }
            }
        }

        return answer;
    }

    //큐 풀이
    public int solution1(int[] priorities, int location) {
        int answer = 0;

        //큐에 배열 넣기
        Queue<Integer> q = new LinkedList<>();
        for(int num : priorities){
            q.offer(num);
        }

        int idx = location; //해당 위치를 기억하기 위한 변수

        while(!q.isEmpty()){
            for(int i=0; i< priorities.length; i++){
                int max = Collections.max(q);   //큐의 최댓값
                if(q.peek() == max){            //첫번째 요소가 중요도가 가장 높다면
                    q.poll();                   //프린트
                    answer++;
                    if(idx == 0){
                        return answer;
                    }
                }else{
                    q.add(q.peek());
                    q.poll();
                }//if end
                idx--;  //poll()을 해주면 위치가 1씩 앞으로 온다.
                if(idx == -1) idx = q.size() - 1;   //위치를 맨 뒤로 보내주기
            }//for end
        }//while end

        return answer;
    }
}
