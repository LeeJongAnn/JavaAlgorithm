class 길이에따른연산 {

    public int solution(int[] num_list) {

        int result = 0;
        if (num_list.length >= 11) {

            for (int i = 0; i < num_list.length; i++) {
                result += num_list[i];
            }
        } else {
            result = 1;
            for(int i = 0; i< num_list.length; i++) {
                result *= num_list[i];
            }
        }
        return result;
    }
}