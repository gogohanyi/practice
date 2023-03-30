package level2.p0330;

import java.util.LinkedList;

public class Solution2 {

    //[1차] 캐시
    public int solution(int cacheSize, String[] cities) {

        if(cacheSize == 0) return cities.length * 5;    //cache 사이즈가 0일 때

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();  //캐시 알고리즘 이용

        for(int i = 0; i < cities.length; i++){
            String s = cities[i].toLowerCase();

            //cache hit
            if(cache.remove(s)){     //해당 값이 있으면 삭제 후 true, 없으면 false 반환.
                cache.add(s);
                answer += 1;
            }
            //cache miss
            else {
                answer += 5;
                if(cache.size() >= cacheSize){   //list의 사이즈가 캐시사이즈보다 크면
                    cache.remove(0);      //맨 앞의 값 삭제
                }
                cache.add(s);
            }
        }//for end

        return answer;
    }
}//class end
