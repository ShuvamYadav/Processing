import processing.core.PApplet;

public class Processing extends PApplet {

    private int cursor = 0;
    private int cursor2 = 0;
    private int cursor3 = 0;
    private int cursor4 = 0;
    private final int HEIGHT = 480;

    public static void main(String[] args) {
        PApplet.main("Processing", args);

    }

    @Override
    public void settings() {
        super.settings();
        int WIDTH = 640;
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
        drawCircle2();
        drawCircle3();
        drawCircle4();
        cursor++;
        cursor2 += 2;
        cursor3 += 3;
        cursor4 += 4;
    }

    private void drawCircle4() {
        ellipse(cursor4, (float) (0.8 * HEIGHT), 10, 10);
    }

    private void drawCircle3() {
        ellipse(cursor3, (float) (0.6 * HEIGHT), 10, 10);

    }

    private void drawCircle2() {
        ellipse(cursor2, (float) (0.4 * HEIGHT), 10, 10);
    }

    private void drawCircle() {
        ellipse(cursor, (float) (0.2 * HEIGHT), 10, 10);
    }

}
