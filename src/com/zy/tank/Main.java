package com.zy.tank;


/**
 * 〈〉
 *
 * @author zhangzhongyan
 * @create 2020/12/9
 * @since 1.0.0
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }
}