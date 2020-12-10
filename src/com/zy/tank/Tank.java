package com.zy.tank;

import java.awt.Graphics;

/**
 * 〈〉
 *
 * @author zhangzhongyan
 * @create 2020/12/10
 * @since 1.0.0
 */

public class Tank {

    private static final int SPEED = 5;

    private Dir dir = Dir.DOWN;
    private int x, y;

    private boolean moving = false;

    private TankFrame tf = null;

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }


    public Tank(int x, int y, Dir dir, TankFrame tf) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        move();
    }

    private void move() {
        if (!moving) return;
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
    }

    public void fire() {
        tf.b = new Bullet(this.x, this.y, this.dir);
    }
}
