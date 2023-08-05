
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 팩토리얼 {

    public static void main(String[] args) {
        Solution so = new Solution();

        so.solution(24);
    }

    public int solution(int k) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            int factorial = factorial(i);
            if (factorial == k) {
                System.out.println("값이 같습니다.");
                result = i;
            } else if(factorial < k){
                result = i;
            }
        }
        return result;
    }

    public static int factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
