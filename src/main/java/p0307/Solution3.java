package p0307;

public class Solution3 {

    //문자열 다루기 기본 : 숫자로만 이루어져 있는지 체크
    public boolean solution(String s) {

        //s 글자수 4 or 6인지 확인
        boolean answer = s.length() == 4 || s.length() == 6 ? true : false;

        //s가 알파벳 포함시 answer false
        try {
            Long.parseLong(s);
        }catch  (Exception e) {
            answer = false;
        }

        return answer;
    }//soution() end
}//class end
