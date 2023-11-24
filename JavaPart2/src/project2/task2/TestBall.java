package project2.task2;


public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(2.5, 3.5);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        ball1.setX(2);
        ball1.setY(2);
        System.out.println("Координаты первого мяча: x=" + ball1.getX() + " y=" + ball1.getY());
        ball2.setXY(4, 4);
        ball2.move(1, 1);
        System.out.println(ball2.toString());
    }
}
