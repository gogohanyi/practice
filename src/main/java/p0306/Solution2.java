package p0306;

public class Solution2 {

    //가운데 글자 가져오기
    public String solution(String s) {

        int size = s.length();  //s 문자열 길이
        int mid = size/2;       //중간 index

        if(size%2 == 0){
            return s.substring(mid-1, mid+1);
        }else {
            return s.substring(mid, mid+1);
        }//if end

    }//solution() end

}//class end
