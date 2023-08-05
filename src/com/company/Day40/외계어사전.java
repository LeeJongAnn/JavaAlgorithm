import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 외계어사전 {

    public static Integer result = 0;

    public static void main(String[] args) {

        String[] spell = { "z", "d", "x" };
        String[] dic = { "def", "dww", "dzxdzx", "loveaw" };
        solution(spell, dic);
    }

    public static int solution(String[] spell, String[] dic) {

        for (String str : dic) {
            List<String> collect = Arrays.stream(str.split("")).collect(Collectors.toList());
            System.out.println(collect);
            int number = 0;
            for (String list : spell) {
                System.out.print(list + " ");
                if (collect.contains(list)) {
                    number += 1;
                    if (number == spell.length) {
                        result = 1;
                        if(result == 1) {
                            return 1;
                        }
                    } else {
                        result = 2;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}