class Solution {
    public int solution(int num1, int num2) {
        double dnum1 = (double)num1;
        double dnum2 = (double)num2;
        double tmp = dnum1 / dnum2;
        int answer = (int)(tmp * 1000);
        return answer;
    }
}