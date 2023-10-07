package com.company.Programmers.Level0.Day54;

class 옹알이 {
    static String Nstr = "";

    public static void main(String[] args) {
        String str[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        Solution sol = new Solution();
        sol.solution(str);
    }

    public int solution(String[] babbling) {
        String k[] = {"aya", "ye", "woo", "ma"};
        int result = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (babbling[i].contains(k[j])) {
                    babbling[i] = babbling[i].replace(k[j], "*");
                }
            }
            System.out.println(babbling[i]);

        }
        for (String str : babbling) {
            String[] split = str.split("");
            int test = 0;
            for (int g = 0; g < split.length; g++) {
                if (split[g].equals("*")) {
                    test += 1;
                } else {
                    test += 0;
                }

                if (test == split.length) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
