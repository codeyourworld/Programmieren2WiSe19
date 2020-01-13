package haw_hamburg.de.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        TextView textView = findViewById(R.id.textView2);

        Intent intent = getIntent();

        if(intent.hasExtra(MainActivity.NAME_KEY)){
            String name = intent.getStringExtra(MainActivity.NAME_KEY);
            textView.setText(name);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        finish();
        return super.onTouchEvent(event);
    }
}
