import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class 예산 {

    public int solution(int[] d, int budget) {

        List<Integer> array = new ArrayList<>();
        int result = 0;
        int count = 0;
        for (int i = 0; i < d.length; i++) {

            array.add(d[i]);

        }
        Collections.sort(array);

        for(int i = 0 ; i<array.size(); i++) {
            result += array.get(i);
            count++;
            if(result > budget) {
                result -= array.get(i);
                count--;
            }
        }
        System.out.println(result);
        System.out.println(array);
        return count;
    }
}