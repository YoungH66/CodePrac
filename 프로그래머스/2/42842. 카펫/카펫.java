class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sumOfTwoSides = brown / 2;
        for(int length = sumOfTwoSides - 1; length >= sumOfTwoSides / 2 ; length--){
            int width = sumOfTwoSides - length;
            if((width-1) * (length-1) == yellow){
                answer[0] = length + 1;
                answer[1] = width + 1;
                return answer;
            }
        }
        return answer;
    }
}
