package level1.p0309;

public class Solution2 {

    //이상한 문자 만들기
    public String solution(String s) {

        String[] arr = s.split("");     //s 문자열 배열로 변환

        int index = 0;                        //공백 후 index 초기화하기 위한 변수
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(" ")){           //요소가 공백일 때
                arr[i] = " ";
                index = 1;                    //공백인 요소 다음은 index 홀수
            }else{
                if(index%2 == 0 || i == 0){       //짝수면 대문자 변환
                    arr[i] = arr[i].toUpperCase();
                }else {                           //홀수면 소문자 변환
                    arr[i] = arr[i].toLowerCase();
                }
            }//if end
            index++;
            System.out.print(arr[i]);
        }//for end

        //배열을 다시 문자열로 변환
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            answer.append(arr[i]);
        }

        return answer.toString();
    }//solution() end

}//class end
