package haw_hamburg.de.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;
    private Rect upper;
    private Rect lower;
    private Rect player;
    private int width;
    private int height;
    private static final int PIPE_WIDTH = 150;
    private static final int GAP_BETWEEN_PIPES = 500;
    private int gapUpperLowerPipe;
    private LinkedList<Rect> pipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);

        pipes = new LinkedList<>();
        //hol die Breite und höhe des Bildschirms
        getDisplaySize();

        //Der Spalt zwischen den beiden Säulen soll 1/10 der Bildschirmgröße sein.
        gapUpperLowerPipe = height / 10;

        //erstelle das erste Säulenpaar
        lower = new Rect(width - PIPE_WIDTH, 1000, width, height);
        upper = new Rect(width - PIPE_WIDTH, 0, width, lower.top - gapUpperLowerPipe);
        pipes.add(lower);
        pipes.add(upper);

        //füge weitere Säulenpaare hinzu
        addNewPipePair();
        addNewPipePair();
        addNewPipePair();

        //erstelle ein Rechteck für den Vogel
        player = new Rect(20, 400, 70, 450);

        //Übergib die Säulenpaare und den Vogel an die Gameview, wo das Spielfeld gezeichnet wird
        gameView.setPipes(pipes);
        gameView.setPlayer(player);

        //das gezeichnete Spielfeld, soll auf dem Bildschirm dargestellt werden.
        // Vorher hatten wir an dieser stelle immer die Layout datei gesetzt.
        setContentView(gameView);

        /*
        Es wird ein Timer erzeugt, der eine Aufgabe den TimerTask ausführt. In der run-Methode wird (wie auch bei Threads)
        definiert was passieren soll wenn der Timer abgelaufen ist. Ein Timer kann periodisch (wie hier alle 33ms) Alarm schlagen oder nur einmalig.
        ZUsätzlich kann ein Delay gesetzt werden (hier 0ms), dies ist sinnvoll,
        wenn eine Aufgabe erst in z.B. 5 Stunden das erste mal ausgeführt werden soll und danach aber alle 30 min.
         */
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                //wenn die Säulen aus dem Bild rausgelaufen sind, sollen sie entfernt werden.
                //Anschließend sollen neue Pipes erstellt werden.
                if(pipes.getFirst().right < 0) {
                    pipes.removeFirst();
                    pipes.removeFirst();

                    addNewPipePair();
                }
                //Rechteck nach links verschieben
                for(Rect rect : pipes) {
                    rect.left--;
                    rect.right--;
                }

                //neu zeichnen
                gameView.postInvalidate();
            }
        }, 0, 33);




    }

    /*
    Diese Methode erstellt ein neues Säulenpaar und fügt es zur Liste hinzu. Bisher gibt es immer bei 1000 Pixeln den Spalt zwischen dem Säulenpaar.
    Dieser Spalt sollte zufällig erzeugt werden. Dabei soll eine Säule immer eine Mindesthöhe haben.
     */
    private void addNewPipePair() {
        pipes.add(new Rect(pipes.getLast().right + GAP_BETWEEN_PIPES, 1000,
                pipes.getLast().right + GAP_BETWEEN_PIPES + PIPE_WIDTH, height));

        pipes.add(new Rect(pipes.getLast().left, 0, pipes.getLast().right,
                pipes.getLast().top - gapUpperLowerPipe));
    }

    /*
    Diese Methode setzt die Displaygröße(Breite und Höhe) in Pixeln. Die Instanzvariablen width und height bekommen die entsprechenden Werte
     */
    private void getDisplaySize() {
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        width = point.x;
        height = point.y;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);

        //TODO der vogel soll steigen
    }
}
