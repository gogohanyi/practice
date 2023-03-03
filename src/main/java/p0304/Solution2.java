package p0304;

public class Solution2 {

    //핸드폰 번호 가리기
    public String solution(String phone_number) {

        String[] arr = String.valueOf(phone_number).split("");  //배열에 번호 담기

        for(int i=0; i<arr.length-4; i++){  //반복문으로 뒷 네자리 빼고 *로 변환
            arr[i] = "*";
        }//for end

        StringBuilder result = new StringBuilder();
        for(int i=0; i< arr.length; i++){
            result.append(arr[i]);
        }
        return result.toString();
    }

}//class end
