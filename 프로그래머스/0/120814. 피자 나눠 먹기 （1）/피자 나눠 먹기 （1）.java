class Solution {
    public int solution(int n) {
        int count = 0;
        do{
            count ++;    
          }
        while(n > (count * 7));
        return count;
    }
}