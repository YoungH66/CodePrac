import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        // String으로 저장할 문자열
        String[] arr = new String[numbers.length];

        // numbers의 각 인덱스를 arr에 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 비교
        // o1, o2가 compare의 매개변수로 비교함.
        // o2 + o1 와 o1 + o2를 비교하여 compare로 사전순으로 비교.
        // compareTo는 문자열이 주어진 문자열보다 작으면 음수, 같으면 0, 크면 양수를 반환함.
        // sort로 결과를 정렬.
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        // 정렬 후 첫 인덱스가 0이라면, 0을 반환.
        if (arr[0].equals("0")) {
           return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }
}