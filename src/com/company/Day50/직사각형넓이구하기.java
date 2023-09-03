import java.util.Arrays;

class 직사각형넓이구하기 {

    public int solution(int[][] dots) {

        int minx = dots[0][0];
        int miny = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        for (int i = 0; i < dots.length; i++) {

            minx = Math.min(minx, dots[i][0]);
            miny = Math.min(miny, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);

        }
        int result = (maxX-minx) * (maxY-miny);
        return result;
    }
}