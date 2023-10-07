package com.company.Programmers.Level0.Day52;

class 안전지대 {

    static int count = 0;

    public static void main(String[] args) {

        int board[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0 } };
        Solution sol = new Solution();
        sol.solution(board);

    }

    public int solution(int[][] board) {
        int answer = 0;

        int[][] array = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                array[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    makeDanger(i, j, array);
                }
            }
        }
        countZero(array);
        showTable(array);
        System.out.println(count);
        return count;
    }

    void makeDanger(int i, int j, int newBoard[][]) {
        int overX = newBoard.length;
        int overY = newBoard[0].length;

        newBoard[i][j] = 1;
        if (i > 0)
            newBoard[i - 1][j] = 2;
        if (j > 0)
            newBoard[i][j - 1] = 2;
        if (i < overX - 1) {
            newBoard[i + 1][j] = 2;
        }
        if (i < overY - 1) {
            newBoard[i][j + 1] = 2;
        }
        if (i > 0 && j > 0) {
            newBoard[i - 1][j - 1] = 2;
        }
        if (j < overY - 1 && i > 0) {
            newBoard[i - 1][j + 1] = 2;
        }
        if (i < overX - 1 && j < overY - 1) {
            newBoard[i + 1][j + 1] = 2;
        }
        if (i < overX - 1 && j > 0) {
            newBoard[i + 1][j - 1] = 2;
        }

    }

    void countZero(int[][] newBoard) {

        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[0].length; j++) {
                if (newBoard[i][j] == 0) {
                    count += 1;
                }
            }
        }
    }

    void showTable(int[][] newBoard) {

        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[0].length; j++) {
                System.out.print(newBoard[i][j]);
            }
            System.out.println();
        }
    }
}