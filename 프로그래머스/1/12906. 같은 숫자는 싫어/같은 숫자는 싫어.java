import java.util.*;

public class Solution {
    
    // int[] -> Stack<Integer>
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

//        int[] answer = new int[stack.size()];
//
//        for (int i = answer.length - 1; i >= 0; i--) {
//            answer[i] = stack.pop();
//        }

        // 반환값 바꾸기
        return stack;
    }
}