// 좋아요를 가장 많이 받은 답안.
// 비효율적인 부분이 있다는 코멘트 있음.
// HashMap 사용

import java.util.HashMap;

class Solution {
    
    // 참가자인 participant와 완주자인 completion을 받음.
    public String solution(String[] participant, String[] completion) {
        // 결과값으로 반환할 String 선언
        String answer = "";
        
        // hashmap 사용
        HashMap<String, Integer> hm = new HashMap<>();
        
        // getOrDefault 사용.
        // 찾을 키에 대한 값이 존재하면 키의 값을, 키에 대한 값이 존재하지 않을 경우 기본값을 반환함.
        // 아래와 같을 경우 찾을 키는 player로 player에 대한 값이 존재한다면 해당 값으로,
        // 존재하지 않을 경우 기본키인 0을 반환한다.
        // 이후 + 1 에 의해 1이 증가한 값이 추가된다.
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        // keySet 이후 get을 사용함에 있어 효율적이지 못하다는 의견이 있음. 확인 필요.
        // 조건에 맞는 결과 반환
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
