import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        // 모든 조합
        combination(numbers, "", set);
        // 소수 판별
        int answer = 0;
        for (Integer num : set) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                answer++;
            }
        }
        return answer;
    }

    public void combination(String numbers, String str, Set<Integer> set) {
        int len = numbers.length();
        if (!"".equals(str)) {
            set.add(Integer.valueOf(str));
        }
        for (int i = 0; i < len; i++) {
            combination(numbers.substring(0, i) + numbers.substring(i + 1, len), str + numbers.charAt(i), set);
        }
    }
}