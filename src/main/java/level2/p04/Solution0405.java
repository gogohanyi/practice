package level2.p04;

import java.util.HashSet;
import java.util.Set;

public class Solution0405 {

    //연속 부분 수열 합의 개수
    public int solution(int[] elements) {

        Set<Integer> set = new HashSet<>();

        int size = elements.length;
        for(int length = 1; length <= size; length++){
            for(int i = 0; i < size; i++){
                int sum = 0;
                for(int j = 0; j < length; j++){
                    int idx = (i + j) % size;
                    sum += elements[idx];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
