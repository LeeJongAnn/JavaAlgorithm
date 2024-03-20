class Solution {
      public static int solution(int[] num_list) {

        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            int number = num_list[i];

            while (number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                    sum += 1;
                } else if( number % 2 != 0){
                    number = number -1;
                }
            }
        }

        return sum;
    }
}