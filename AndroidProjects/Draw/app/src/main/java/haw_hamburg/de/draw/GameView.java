package haw_hamburg.de.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.util.LinkedList;

public class GameView extends View {

    //rechteck für den vogel
    private Rect player = new Rect(0, 0, 0, 0);

    //Liste mit Säulenpaaren
    private LinkedList<Rect> pipes = new LinkedList<>();

    //das paint-Objekt sorgt dafür, dass wir Formen wie Rechtecken eine Farbe geben können
    private Paint paint = new Paint();

    public GameView(Context context) {
        super(context);
    }

    //In dieser Methode malen wir unser Spielfeld
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //setze eine Farbe
        paint.setColor(Color.argb(0xff, 25, 130, 150));

        //geh durch die Liste und male jedes Rechteck in der gesetzten Farbe
        for(Rect rect : pipes) {
            canvas.drawRect(rect, paint);
        }

        //setze eine andere Farbe
        paint.setColor(Color.argb(0xff, 120, 95, 50));

        //male das Rechteck für den Vogel
        canvas.drawRect(player, paint);
    }

    //Das vogel rechteck und die Liste der Säulenpaare werden mit Settern übergeben und wenn sich die
    // Werte in der MainActivity ändern, ändern sich die Werte auch hier. Weil ihre Referenz übergeben wird.
    //In dem Fall muss nur neugezeichnet werden.
    public void setPlayer(Rect player) {
        this.player = player;
    }

    public void setPipes(LinkedList<Rect> pipes) {
        this.pipes = pipes;
    }
}
