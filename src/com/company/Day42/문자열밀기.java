import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 문자열밀기 {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";

        solution(a, b);

    }

    public static int solution(String A, String B) {

        int result = 0;
        List<String> collect = Arrays.stream(A.split("")).collect(Collectors.toList());
        int size = collect.size();
        for (int i = 0; i < collect.size(); i++) {
            String str = "";
            String remove = collect.remove(collect.size() - 1);
            collect.add(0, remove);
            size--;
            result += 1;
            for (String list : collect) {
                str += list;
            }
            if (A.equals(B)) {
                result = 0;
            } else if (str.equals(B)) {
                System.out.println("같습니다.");
                return result;
            } else if (size == 0) {
                result = -1;
            }
        }
        System.out.println(result);
        return result;
    }
}