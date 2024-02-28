// 해시 사용하기.
// getOrDefault를 사용해서 중복되는 값 없게 사용
// 최대치는 n/2, 그 이하는 값이 있는 키 수로?
// 첫 시도
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer ponke : nums) hm.put(ponke, hm.getOrDefault(ponke, 0));
        if(hm.size() >= max)
            return max;
        answer = hm.size();
        return answer;
    }
}