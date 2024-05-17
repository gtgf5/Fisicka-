package org.openjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.WindowEvent;
import org.openjfx.Animation.Shake;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class FerdController {
    @FXML
    private void switchToBack() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void ror() throws IOException, InterruptedException {
        c=0;
        ad = true;
        if (potoks == 0) {
            ascend = true;
            stop = false;

            potoks++;
            z = 0;

            future = scheduler.scheduleAtFixedRate(runnable, 0, 500, MILLISECONDS);
        } else {
            ascend = true;
            stop = false;
        }
    }


    final Runnable runnable = new Runnable() {

        public void run() {
                if (z==0){c=24;}
                if (stop) {
                    return;
                }
                if ((ascend && z >= 50) || (!ascend && z == 0)) {
                    stop = true;
                    return;
                }
                if (ascend) {
                    z++;
                } else {
                    z--;
                }
                temrecha.setText("t=" + Integer.toString(z));
                initialize1();
        }
    };


    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    int potoks = 0;
    ScheduledFuture future;
    boolean ascend = true;
    boolean ad = true;
    boolean stop = false;

    @FXML
    private void rory() throws IOException {
        ad = false;
        if (stop) {
            return;
        }
        if (potoks == 0) {
            ascend = false;
            ad = false;
            future = scheduler.scheduleAtFixedRate(runnable, 0, 50, MILLISECONDS);
        } else {
            ascend = false;
            stop = false;
        }
    }

    private static javafx.event.EventHandler<WindowEvent> closeEventHandler = new javafx.event.EventHandler<WindowEvent>() {
        @Override
        public void handle(WindowEvent event) {
            System.exit(0);
        }
    };

    public static javafx.event.EventHandler<WindowEvent> getCloseEventHandler() {
        return closeEventHandler;
    }


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Line l1;

    @FXML
    private Line l10;

    @FXML
    private Line l11;

    @FXML
    private Line l12;

    @FXML
    private Line l13;

    @FXML
    private Line l14;

    @FXML
    private Line l15;

    @FXML
    private Line l16;

    @FXML
    private Line l17;

    @FXML
    private Line l18;

    @FXML
    private Line l19;

    @FXML
    private Line l2;

    @FXML
    private Line l20;

    @FXML
    private Line l21;

    @FXML
    private Line l22;

    @FXML
    private Line l23;
    @FXML
    private Line l24;

    @FXML
    private Line l3;

    @FXML
    private Line l4;

    @FXML
    private Line l5;

    @FXML
    private Line l6;

    @FXML
    private Line l7;

    @FXML
    private Line l8;

    @FXML
    private Line l9;


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
    private Text temrecha;
    Shake shake;
    int z = 0;
    int c = 0;

    @FXML
    void initialize() {
        shake = new Shake(cir1, z);
        shake.playAnim();
        shake = new Shake(cir2, z);
        shake.playAnim();
        shake = new Shake(cir3, z);
        shake.playAnim();
        shake = new Shake(cir4, z);
        shake.playAnim();
        shake = new Shake(cir5, z);
        shake.playAnim();
        shake = new Shake(cir6, z);
        shake.playAnim();
        shake = new Shake(cir7, z);
        shake.playAnim();
        shake = new Shake(cir8, z);
        shake.playAnim();
        shake = new Shake(cir9, z);
        shake.playAnim();
        shake = new Shake(cir10, z);
        shake.playAnim();
        shake = new Shake(cir11, z);
        shake.playAnim();
        shake = new Shake(cir12, z);
        shake.playAnim();
        shake = new Shake(cir13, z);
        shake.playAnim();
        shake = new Shake(cir14, z);
        shake.playAnim();
        shake = new Shake(cir15, z);
        shake.playAnim();
        shake = new Shake(cir16, z);
        shake.playAnim();

    }
    @FXML
    void initialize1() {
        shake.Shake1(cir1, z);
        shake.playAnim1();
        shake.Shake1(cir2, z);
        shake.playAnim1();
        shake.Shake1(cir3, z);
        shake.playAnim1();
        shake.Shake1(cir4, z);
        shake.playAnim1();
        shake.Shake1(cir5, z);
        shake.playAnim1();
        shake.Shake1(cir6, z);
        shake.playAnim1();
        shake.Shake1(cir7, z);
        shake.playAnim1();
        shake.Shake1(cir8, z);
        shake.playAnim1();
        shake.Shake1(cir9, z);
        shake.playAnim1();
        shake.Shake1(cir10, z);
        shake.playAnim1();
        shake.Shake1(cir11, z);
        shake.playAnim1();
        shake.Shake1(cir12, z);
        shake.playAnim1();
        shake.Shake1(cir13, z);
        shake.playAnim1();
        shake.Shake1(cir14, z);
        shake.playAnim1();
        shake.Shake1(cir15, z);
        shake.playAnim1();
        shake.Shake1(cir16, z);
        shake.playAnim1();
    }

}
