package org.openjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import org.openjfx.Animation.Ispair;
import org.openjfx.Animation.Shake;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class SecondController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle cir1;

    @FXML
    private Circle cir10;

    @FXML
    private Circle cir11;

    @FXML
    private Circle cir12;

    @FXML
    private Circle cir13;

    @FXML
    private Circle cir14;

    @FXML
    private Circle cir15;

    @FXML
    private Circle cir16;

    @FXML
    private Circle cir2;

    @FXML
    private Circle cir3;

    @FXML
    private Circle cir4;

    @FXML
    private Circle cir5;

    @FXML
    private Circle cir6;

    @FXML
    private Circle cir7;

    @FXML
    private Circle cir8;

    @FXML
    private Circle cir9;

    @FXML
    void switchToBack(ActionEvent event) throws IOException {
        App.setRoot("primary");

    }

    @FXML
    private void ror() throws IOException, InterruptedException {
        ad = false;
        if (potoks == 0) {
            ascend = true;
            stop = false;

            potoks++;
            z = 100;

            future = scheduler.scheduleAtFixedRate(runnable, 0, 1000, MILLISECONDS);
        } else {
            ascend = true;
            stop = false;
        }
    }


    final Runnable runnable = new Runnable() {

        public void run() {
                if (ad) {
                    initialize2();
                    z--;
                    if (z<100) {
                        z++;
                    }
                        temrecha.setText("t=" + Integer.toString(z));

                } else {
                    if (stop) {
                        return;
                    }
                    if ((ascend && z >= 200) || (!ascend && z == 100)) {
                        stop = true;
                        return;
                    }
                    if (ascend) {
                        z++;
                    } else {
                        z--;
                    }
                    temrecha.setText("t=" + Integer.toString(z));
                    try {
                        initialize1();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    };
    @FXML
    private Text temrecha;

    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    int potoks = 0;
    ScheduledFuture future;
    boolean ascend = true;
    boolean ad = false;
    boolean stop = false;

    @FXML
    private void rory() throws IOException {
        ad = true;
        if (stop) {
            return;
        }
        if (potoks == 0) {
            ascend = false;
            ad = false;
            future = scheduler.scheduleAtFixedRate(runnable, 0, 1000, MILLISECONDS);
        } else {
            ascend = false;
            stop = false;
        }
    }

    int c = 0;
    int z = 100;
    Ispair shake;
    Ispair shake1;
    Ispair shake2;
    Ispair shake3;
    Ispair shake4;
    Ispair shake5;
    Ispair shake6;
    Ispair shake7;
    Ispair shake9;
    Ispair shake8;
    Ispair shake10;
    Ispair shake11;
    Ispair shake12;
    Ispair shake13;
    Ispair shake14;
    Ispair shake15;


    void initialize1() throws InterruptedException {
        switch (z - 100) {
            case (1):
                shake.dplay();
                shake.Shake1(cir1, z);
                shake.playAnim1();
                break;
            case (5):
                shake.playAnime(cir1, z);
                shake7.dplay();
                shake.Shake1(cir8, z);
                shake.playAnim1();
                break;
            case (9):
                shake7.playAnime(cir8, z);
                shake6.dplay();
                shake.Shake1(cir7, z);
                shake.playAnim1();
                break;
            case (13):
                shake5.playAnime(cir7, z);
                shake13.dplay();
                shake.Shake1(cir14, z);
                shake.playAnim1();
                break;
            case (17):
                shake13.playAnime(cir14, z);
                shake2.dplay();
                shake.Shake1(cir3, z);
                shake.playAnim1();
                break;
            case (21):
                shake2.playAnime(cir3, z);
                shake8.dplay();
                shake.Shake1(cir9, z);
                shake.playAnim1();
                break;
            case (25):
                shake8.playAnime(cir9, z);
                shake12.dplay();
                shake.Shake1(cir13, z);
                shake.playAnim1();
                break;
            case (29):
                shake12.playAnime(cir13, z);
                shake5.dplay();
                shake.Shake1(cir6, z);
                shake.playAnim1();
                break;
            case (33):
                shake5.playAnime(cir6, z);
                shake1.dplay();
                shake.Shake1(cir2, z);
                shake.playAnim1();
                break;
            case (37):
                shake1.playAnime(cir2, z);
                shake4.dplay();
                shake.Shake1(cir5, z);
                shake.playAnim1();
                break;
            case (41):
                shake4.playAnime(cir5, z);
                shake15.dplay();
                shake.Shake1(cir16, z);
                shake.playAnim1();
                break;
            case (45):
                shake15.playAnime(cir16, z);
                shake10.dplay();
                shake.Shake1(cir11, z);
                shake.playAnim1();
                break;
            case (49):
                shake10.playAnime(cir11, z);
                shake9.dplay();
                shake.Shake1(cir10, z);
                shake.playAnim1();
                break;
            case (53):
                shake9.playAnime(cir10, z);
                shake14.dplay();
                shake.Shake1(cir15, z);
                shake.playAnim1();
                break;
            case (57):
                shake14.playAnime(cir15, z);
                shake11.dplay();
                shake.Shake1(cir12, z);
                shake.playAnim1();
                break;
            case (61):
                shake11.playAnime(cir12, z);
                shake3.dplay();
                shake.Shake1(cir4, z);
                shake.playAnim1();
                break;
            case(65):
                shake3.playAnime(cir4, z);
                break;
            default:
                break;
        }
    }

    void initialize2() {
        switch (z - 100) {
            case (1):
                shake.Shake2(cir1);
                shake.playAnim2();
                shake.play();
                break;
            case (5):
                shake.Shake2(cir8);
                shake.playAnim2();
                shake7.play();
                break;
            case (10):

                shake.Shake2(cir7);
                shake.playAnim2();
                shake6.play();
                break;
            case (14):
                shake.Shake2(cir14);
                shake.playAnim2();
                shake13.play();
                break;
            case (19):
                shake.Shake2(cir3);
                shake.playAnim2();
                shake2.play();
                break;
            case (23):

                shake.Shake2(cir9);
                shake.playAnim2();
                shake8.play();
                break;
            case (27):

                shake.Shake2(cir13);
                shake.playAnim2();
                shake12.play();
                break;
            case (31):

                shake.Shake2(cir6);
                shake.playAnim2();
                shake5.play();
                break;
            case (36):

                shake.Shake2(cir2);
                shake.playAnim2();
                shake1.play();
                break;
            case (40):
                shake.Shake2(cir5);
                shake.playAnim2();
                shake4.play();
                break;
            case (45):
                shake.Shake2(cir16);
                shake.playAnim2();
                shake15.play();
                break;
            case (47):
                shake.Shake2(cir11);
                shake.playAnim2();
                shake10.play();
                break;
            case (53):
                shake.Shake2(cir10);
                shake.playAnim2();
                shake9.play();
                break;
            case (61):
                shake.Shake2(cir15);
                shake.playAnim2();
                shake14.play();
                break;
            case (64):
                shake.Shake2(cir12);
                shake.playAnim2();
                shake11.play();
                break;
            case (65):
                shake.Shake2(cir4);
                shake.playAnim2();
                shake3.play();
                break;
            default:
                break;
        }
    }

    @FXML
    void initialize() {
        shake = new Ispair(cir1, z);
        shake.playAnim();
        shake1 = new Ispair(cir2, z);
        shake1.playAnim();
        shake2 = new Ispair(cir3, z);
        shake2.playAnim();
        shake3 = new Ispair(cir4, z);
        shake3.playAnim();
        shake4 = new Ispair(cir5, z);
        shake4.playAnim();
        shake5 = new Ispair(cir6, z);
        shake5.playAnim();
        shake6 = new Ispair(cir7, z);
        shake6.playAnim();
        shake7 = new Ispair(cir8, z);
        shake7.playAnim();
        shake8 = new Ispair(cir9, z);
        shake8.playAnim();
        shake9 = new Ispair(cir10, z);
        shake9.playAnim();
        shake10 = new Ispair(cir11, z);
        shake10.playAnim();
        shake11 = new Ispair(cir12, z);
        shake11.playAnim();
        shake12 = new Ispair(cir13, z);
        shake12.playAnim();
        shake13 = new Ispair(cir14, z);
        shake13.playAnim();
        shake14 = new Ispair(cir15, z);
        shake14.playAnim();
        shake15 = new Ispair(cir16, z);
        shake15.playAnim();
    }

}