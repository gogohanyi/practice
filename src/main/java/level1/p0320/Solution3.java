package level1.p0320;

public class Solution3 {

    //카드 뭉치
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int index1 = 0;     //card1 배열 인덱스
        int index2 = 0;     //card2 배열 인덱스

        for(int i=0; i< goal.length; i++){
            if(index1 < cards1.length && goal[i].equals(cards1[index1])){
                index1++;
                continue;
            }

            if(index2 < cards2.length && goal[i].equals(cards2[index2])){
                index2++;
                continue;
            }

            answer = "No";
            break;
        }

        return answer;
    }//solution() end

}//class end
