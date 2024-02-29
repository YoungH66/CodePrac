// sort/loop 사용한 방법
// 라이브러리 사용
// hash 사용 X
import java.util.Arrays;

class Solution {
    public static boolean solution(String[] phoneBook) {
        // phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        // 직관적으론 2중 Loop를 돌아야 한다고 판단했지만, 
        // 정렬된 String 배열에서 접두어가 1개이든 1개 이상이든 false를 반환하기에
        // 1중 Loop로 해당 문제를 해결할 수 있음.
        for(int i = 0; i < phoneBook.length -1; i++)
            if(phoneBook[i+1].startsWith(phoneBook[i]))
                return false;
        
        // 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }
}