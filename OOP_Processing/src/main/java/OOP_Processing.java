import processing.core.PApplet;

public class OOP_Processing extends PApplet {
    final int WIDTH = 640;
    final int HEIGHT = 480;
    Circle circle1;
    Circle circle2;
    Circle circle3;
    Circle circle4;

    public static void main(String[] args) {
        PApplet.main("OOP_Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circle1 = new Circle(0, (int) (0.2 * HEIGHT), 10, 10);
        circle2 = new Circle(0, (int) (0.4 * HEIGHT), 10, 10);
        circle3 = new Circle(0, (int) (0.6 * HEIGHT), 10, 10);
        circle4 = new Circle(0, (int) (0.8 * HEIGHT), 10, 10);
    }

    @Override
    public void draw() {
        drawBall(circle1);
        drawBall(circle2);
        drawBall(circle3);
        drawBall(circle4);
        circle1.xAxis++;
        circle2.xAxis+=2;
        circle3.xAxis+=3;
        circle4.xAxis+=4;
    }

    private void drawBall(Circle circle) {
        ellipse(circle.xAxis, circle.yAxis, circle.width, circle.height);
    }

}
