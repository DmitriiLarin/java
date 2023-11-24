package project6.task1;

public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int speedX;
    private int speedY;

    public MovablePoint(int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public void moveUp() {
        y+=speedY;
    }

    @Override
    public void moveDown() {
        y-=speedY;
    }

    @Override
    public void moveLeft() {
        x-=speedX;
    }

    @Override
    public void moveRight() {
        x+=speedX;
    }

    @Override
    public String toString() {
        return "Точка{" +
                "x=" + x +
                ", y=" + y +
                ", скорость X=" + speedX +
                ", скорость Y=" + speedY +
                '}';
    }
}
