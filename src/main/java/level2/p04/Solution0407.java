package level2.p04;

import java.util.ArrayList;
import java.util.List;

public class Solution0407 {

    //[1차] 뉴스 클러스터링
    public int solution(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();     //str1 리스트
        List<String> list2 = new ArrayList<>();     //str2 리스트

        //str1 잘라서 list1 리스트에 담기
        for(int i = 0; i < str1.length() - 1; i++){
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);

            if('a' <= c1 && c1 <= 'z' && 'a' <= c2 && c2 <= 'z'){
                list1.add(c1 + "" + c2);
            }
        }

        //str2 잘라서 list2 리스트에 담기
        for(int i = 0; i < str2.length() - 1; i++){
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);

            if('a' <= c1 && c1 <= 'z' && 'a' <= c2 && c2 <= 'z'){
                list2.add(c1 + "" + c2);
            }
        }

        //두 리스트 비교
        int cnt = 0;    //교집합
        int all = 0;    //합집합
        for(String s : list1){
            if(list2.remove(s)){    //겹치면 list2에서 제거 후 교집합 +1
                cnt++;
            }
            all++;                  //합집합 +1
        }//for end
        all += list2.size();        //합집합에 list2의 남은 요소 길이 더하기


        if(all == 0) return 65536;  //합집합이 공집합이면 65536 리턴
        double x = (double) cnt / (double) all;

        return (int) (x * 65536);
    }
}
