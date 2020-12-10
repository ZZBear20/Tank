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

    private int x, y;

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;

    public Tank(int x, int y, Dir dir) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
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
}
