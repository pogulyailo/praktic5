public class Application {
    public static void main(String[] args){

       Point point = new Point(5.5f, 2.5f);
       Point point2 = new Point(6.3f, 4.2f);
        float length = point.calcLength(point2);

        System.out.println(length);

    }
}
