import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 제일작은수제거하기 {
    public static void main(String[] args) {
        int array[] = { 4,3,2,1 };
        solution(array);
    }

    public static List<Integer> solution(int[] arr) {
        int asInt = Arrays.stream(arr).min().getAsInt();
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int indexOf = collect.indexOf(asInt);
        collect.remove(indexOf);
        if(collect.isEmpty()) {
            collect.add(-1);
        }
        return collect;
    }
}