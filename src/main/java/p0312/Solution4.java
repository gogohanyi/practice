package p0312;

public class Solution4 {

    //크기가 작은 부분 문자열
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();

        long[] arr = new long[t.length() - size + 1];   //부분 문자열을 배열에 넣기
        for(int i=0; i<arr.length; i++){
            arr[i] = Long.parseLong(t.substring(i, i + size));
            //System.out.println(arr[i]);
        }//for end

        for(long num : arr){    //p보다 작거나 같은 요소 count
            if(num <= Long.parseLong(p)){
                answer++;
            }
        }//for end

        return answer;
    }

}//class end
