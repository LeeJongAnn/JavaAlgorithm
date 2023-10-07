import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 로그인성공 {

    public static String login = "login";
    public static String wrongpw = "wrong pw";
    public static String fail = "fail";
    public static String status = "";

    public static void main(String[] args) {

        String[] str = { "abc04", "345" };
        String[][] str2 = { { "abc04", "335" }, { "abc03", "345" } };

        solution(str, str2);
    }

    public static String solution(String[] id_pw, String[][] db) {

        List<String> collect = Arrays.stream(id_pw).collect(Collectors.toList());
        List<String[]> collect2 = Arrays.stream(db).collect(Collectors.toList());
        String s = "login";
        List<String> array = new ArrayList<>();
        for (String[] str : collect2) {
            array = Arrays.asList(str);
            if (collect.get(0).equals(array.get(0)) && collect.get(1).equals(array.get(1))) {
                System.out.println("로그인");
                status = login;
                break;
            } else if (collect.get(0).equals(array.get(0)) && !collect.get(1).equals(array.get(1))) {
                System.out.println("비밀번호가 다릅니다.");
                status = wrongpw;
            } else if (!collect.get(0).equals(array.get(0))) {
                System.out.println("아이디가 다릅니다.");
                status = fail;
            }
        }
        return status;
    }
}