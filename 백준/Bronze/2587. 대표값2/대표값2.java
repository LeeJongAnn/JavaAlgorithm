

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    static Integer dp[];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            array.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(array);
        for (int i = 0; i < 5; i++) {
            result += array.get(i);
        }
        Integer integer = array.get(array.size() / 2);
        System.out.println(result/5);
        System.out.println(integer);

    }


}