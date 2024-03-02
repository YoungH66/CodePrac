// 스택을 사용하지 않고, 탐색으로 해결

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        // 판단하기 위한 변수를 하나만 선언
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            
            // 문자열의 시작이 '(' 일 경우만 참
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}