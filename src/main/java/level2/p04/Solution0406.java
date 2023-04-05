package level2.p04;

import java.util.*;

public class Solution0406 {


    //기능개발
    public int[] solution(int[] progresses, int[] speeds) {

        //필요한 작업 일수 배열로 만들기
        int[] tmp = new int[progresses.length];
        for(int i = 0; i < tmp.length; i++){
            double d = (100 - progresses[i]) / (double)speeds[i];
            tmp[i] = (int)Math.ceil(d);
        }

        //작업 일수 비교하여 list에 넣기
        List<Integer> list = new ArrayList<>();
        int x = tmp[0];     //기준이 되는 작업
        int cnt = 1;        //동시에 배포할 수 있는 작업 개수

        for(int i = 1; i < tmp.length; i++){
            if(x >= tmp[i]){
                cnt++;
            }else {
                list.add(cnt);
                cnt = 1;
                x = tmp[i];
            }
        }
        list.add(cnt);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    //큐로 풀기
    public int[] solution1(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();

        //큐에 작업 일수 계산해서 넣기
        for(int i = 0; i < progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                q.add((100 - progresses[i]) / speeds[i]);
            }else {
                q.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        //작업 일수 비교하여 list에 담기
        List<Integer> list = new ArrayList<>();
        int x = q.poll();       //큐에서 첫번째 값 반환 후 제거.
        int cnt = 1;
        while(!q.isEmpty()){    //큐가 빌 때까지 반복 실행
            if(x >= q.peek()){
                cnt++;
                q.poll();
            }else {
                list.add(cnt);
                cnt = 1;
                x = q.poll();
            }
        }//while() end
        list.add(cnt);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
