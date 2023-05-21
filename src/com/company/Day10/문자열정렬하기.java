import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class 문자열정렬하기{
    public List<Integer> solution(String my_string) {

        String result = my_string.replaceAll("[^0-9]","");
        List<Integer> array = new ArrayList<Integer>();
        char a;
        String b;
        Integer c;
        for(int i = 0 ; i<result.length(); i++){
            a = result.charAt(i);
            b = Character.toString(a);
            c = Integer.parseInt(b);
            array.add(c);
            System.out.println(c);
        }

        Collections.sort(array);
        return array;
    }
}