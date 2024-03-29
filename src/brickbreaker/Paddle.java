package brickbreaker;

import java.awt.event.KeyEvent;
import java.security.Key;
import javax.swing.ImageIcon;

public class Paddle extends Sprite implements Commons{

    private int dx;

    public Paddle(){

        initPaddle();
    }

    private void initPaddle(){

        loadImage();
        getImageDimension();

        resetState();
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/brickbreaker/paddle.png");
        image = ii.getImage();
    }

    public void move() {

        x += dx;

        if (x <= 0){
            x = 0;
        }

        if (x >= WIDTH - imageWidth-30) {
            x = WIDTH - imageWidth-30;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT){
            dx = 1;
        }
    }

    public void keyReleased(KeyEvent e){

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
    }

    private void resetState(){

        x = INIT_PADDLE_X;
        y = INIT_PADDLE_Y;
    }
}
