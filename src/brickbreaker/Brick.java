package brickbreaker;

import javax.swing.ImageIcon;

public class Brick extends Sprite{

    private boolean destroyed;

    public Brick(int x, int y) {

        initBrick(x,y);
    }

    private void initBrick(int x, int y){

        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimension();
    }

    private void loadImage(){

        ImageIcon ii = new ImageIcon("src/brickbreaker/brick.png");
        image = ii.getImage();
    }

    public boolean isDestroyed() {

        return destroyed;
    }

    public void setDestroyed(boolean val) {

        destroyed = val;
    }
}
