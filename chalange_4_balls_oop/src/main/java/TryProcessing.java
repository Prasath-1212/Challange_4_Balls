import processing.core.PApplet;
import java.util.ArrayList;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    ArrayList<Ball> balls = new ArrayList<Ball>();

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
        balls.add(new Ball(0, (float) HEIGHT / 5, 1));
        balls.add(new Ball(0, (float) 2 * HEIGHT / 5, 2));
        balls.add(new Ball(0, (float) 3 * HEIGHT / 5, 3));
        balls.add(new Ball(0, (float) 4 * HEIGHT / 5, 4));
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.move();
            ball.display();
        }
    }

    class Ball {
        float x, y;
        float speed;

        Ball(float xpos, float ypos, float spd) {
            x = xpos;
            y = ypos;
            speed = spd;
        }

        void move() {
            x += speed;
        }

        void display() {
            ellipse(x, y, 10, 10);
        }
    }
}
