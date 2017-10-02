public class Point {
    float x;
    float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Float calcLength(Point otherPoint) {


        float res1;
        float res2;

        float res;

        res1 = (otherPoint.x - x) * (otherPoint.x - x);
        res2 = (otherPoint.y - y) * (otherPoint.y - y);

        res = (float) Math.sqrt(res1 - res2);
        return res;

    }
}





