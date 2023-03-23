package level2.p0322;

public class Solution2 {

    //JadenCase 문자열 만들기
    public String solution(String s) {

        s = s.toLowerCase();    //모든 문자 소문자로 치환

        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");

        boolean flag = false;   //공백인 경우 flag true로 변환

        for(int i=0; i<arr.length; i++){

            if(flag || i == 0){
                sb.append(arr[i].toUpperCase());
                flag = false;
            } else if (arr[i].equals(" ")) {
                if(i<arr.length-1 && arr[i+1].isBlank()){
                    sb.append(" ");
                }else {
                    sb.append(" ");
                    flag = true;
                }
            }else {
                sb.append(arr[i]);
            }//if end

        }//for end

        return sb.toString();
    }
}//class end
