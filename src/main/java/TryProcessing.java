import processing.core.PApplet;

import java.util.ArrayList;

public class TryProcessing extends PApplet{

    public static final int HEIGHT = 1200;
    public static final int ONE_HEIGHT_UNIT = HEIGHT / 5;
    public static final int WIDTH = 1800;
    public static final int DIAMETER = 70;
    public static final int START = 200;

    public static int increment = 0;


    ArrayList<Ball> ballList = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
        createBalls();
    }

    private void createBalls() {
        for (int i = 1; i <= 4; i++) {
            ballList.add(setBallParameters(i, new Ball()));
        }
    }

    private void paintWhite() {
        background(255);
    }

    @Override
    public void draw() {

        moveBalls();
//        updateBallsPosition();
//        DisplayBalls();

//        move4Circles();
    }


    private void moveBalls() {

        int speed;

        for (int index = 0; index < ballList.size(); index++) {

            Ball ball  = ballList.get(index);

            speed = getSpeed(index);
            ball.moveX(speed);

            createEllipseWithBall(ball);
        }
    }

    private void createEllipseWithBall(Ball ball) {
        ellipse(
                ball.getPositionX(),
                ball.getPositionY(),
                ball.getDiameter(),
                ball.getDiameter()
        );
    }

    private int getSpeed(int index) {
        return index + 1;
    }

    private Ball setBallParameters(int position, Ball ball) {

        ball.setDiameter(70);
        ball.setPositionX(START);
        ball.setPositionY(getHeightPosition(position));

        return ball;
    }

//    private void move4Circles() {
//
//        for (int i = 1; i <= 4; i ++) {
//            ellipse(getWidthPosition(i), getHeightPosition(i), DIAMETER, DIAMETER);
//        }
//
//        increment += 1;
//
//    }

    private int getHeightPosition(int i) {
        return i * ONE_HEIGHT_UNIT;
    }

//    private int getWidthPosition(int i) {
//        return START + increment * i;
//    }


}
