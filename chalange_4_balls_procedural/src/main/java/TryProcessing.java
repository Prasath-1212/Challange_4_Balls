import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static float ball1X, ball1Y, ball1Speed;
    public static float ball2X, ball2Y, ball2Speed;
    public static float ball3X, ball3Y, ball3Speed;
    public static float ball4X, ball4Y, ball4Speed;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(255);

        ball1X = 0;
        ball1Y = (float) HEIGHT / 5;
        ball1Speed = 1;

        ball2X = 0;
        ball2Y = (float) 2 * HEIGHT / 5;
        ball2Speed = 2;

        ball3X = 0;
        ball3Y = (float) (3 * HEIGHT) / 5;
        ball3Speed = 3;

        ball4X = 0;
        ball4Y = (float) (4 * HEIGHT) / 5;
        ball4Speed = 4;
    }

    @Override
    public void draw() {
        ball1X = moveBall(ball1X, ball1Speed);
        ellipse(ball1X, ball1Y, 10, 10);

        ball2X = moveBall(ball2X, ball2Speed);
        ellipse(ball2X, ball2Y, 10, 10);

        ball3X = moveBall(ball3X, ball3Speed);
        ellipse(ball3X, ball3Y, 10, 10);

        ball4X = moveBall(ball4X, ball4Speed);
        ellipse(ball4X, ball4Y, 10, 10);
    }

    float moveBall(float x, float speed) {
        x += speed;
        return x;
    }
}
