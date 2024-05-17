package org.openjfx.Animation;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

import java.util.Random;

public class Ispair {
    private final TranslateTransition circular1;
    private TranslateTransition circular2;
    private TranslateTransition circular3;
    private TranslateTransition circular4;
    Random rn = new Random();
    int y = 0;

    public void Shake1(Node node, int d) throws InterruptedException {
        circular2 = new TranslateTransition(Duration.millis(4000), node);
        circular2.setByX(rn.nextInt(5) + d * 0.1);
        circular2.setByY(-200);
    }

    public void Shake2(Node node) {
        circular3 = new TranslateTransition(Duration.millis(1000), node);
        circular3.setToY(0);
    }

    public Ispair(Node node, int d) {
        circular1 = new TranslateTransition(Duration.millis(150), node);
        circular1.setByX(rn.nextInt(5) + d * 0.1);
        circular1.setByY(rn.nextInt(5) + d * 0.1);
        circular1.setCycleCount(10000);
    }
    public void Ispair1(Node node, int d) {
        circular4 = new TranslateTransition(Duration.millis(150), node);
        circular4.setFromY(-200);
        circular4.setByX(rn.nextInt(5) + d * 0.1);
        circular4.setCycleCount(10000);
    }

    public void playAnim1() {
        circular2.playFromStart();
    }

    public void playAnim2() {
        circular3.playFromStart();
    }

    public void playAnim() {
        circular1.playFromStart();
    }

    public void playAnime(Node node, int d) {
        Ispair1(node , d);
        circular4.playFromStart();
    }

    public void dplay() {
        circular1.pause();
    }

    public void play() {
        circular1.play();
    }
    public void dplay1() {
        circular4.pause();
    }

    public void play1() {
        circular4.play();
    }

}
