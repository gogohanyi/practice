package level1.p0309;

public class Solution3 {

    //시저 암호
    public String solution(String s, int n) {
        String answer = "";

        //아스키코드 출력
        char x = 'Z' - 'A';
        System.out.println((int)x);     //25
        System.out.println((int)'Z');   //90
        System.out.println((int)'z');   //122

        char[] arr = s.toCharArray();   //s를 char배열로 변환
        for(char ch : arr){
            if(ch == ' '){              //공백일 때
                answer += " ";
            }else{
                if(ch <= 90){           //대문자일 때
                    ch += n;
                    if(ch > 90) {ch -= 26;}
                }else{                  //소문자일 때
                    ch += n;
                    if(ch > 122) {ch -= 26;}
                }
            answer += ch;
            }//if end
        }//for end

        return answer;
    }

}//class end
