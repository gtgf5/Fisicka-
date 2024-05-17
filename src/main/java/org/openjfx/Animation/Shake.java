package org.openjfx.Animation;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

import java.util.Random;

public class Shake {
    private final TranslateTransition cirkul;
    private TranslateTransition cirkul1;


    Random rn = new Random();
    public Shake(Node node,int d){
        cirkul= new TranslateTransition(Duration.millis(100),node);
        cirkul.setFromX(0f);
        cirkul.setFromY(0f);
        cirkul.setByX(1f+d*0.1);
        cirkul.setByY(1f+d*0.1);
        cirkul.setCycleCount(10000);
        cirkul.setAutoReverse(true);
    }
    public void Shake1( Node node ,int d){
        cirkul1 = new TranslateTransition(Duration.millis(100), node);
        cirkul1.setFromX(0f);
        cirkul1.setFromY(0f);
        cirkul1.setByX(rn.nextInt(10)+d*0.1);
        cirkul1.setByY(rn.nextInt(10)+d*0.1);
        cirkul1.setCycleCount(10000);
        cirkul1.setAutoReverse(true);
    }
    public void playAnim(){
        cirkul.playFromStart();
    }
    public void playAnim1(){
        cirkul1.playFromStart();
    }
    public void  deplay(){cirkul1.stop();cirkul.stop();}
    public void DeShake(int d){
        cirkul.setFromX(0f);
        cirkul.setFromY(0f);
        cirkul.setByX(1f+d*0.1);
        cirkul.setByY(1f+d*0.1);
        cirkul.setCycleCount(10000);
        cirkul.setAutoReverse(true);
    }

}
