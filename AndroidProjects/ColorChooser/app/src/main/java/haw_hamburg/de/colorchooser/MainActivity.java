package haw_hamburg.de.colorchooser;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TestOutput";
    private int red = 0;
    private int green = 0;
    private int blue = 0;

    //TODO deklariere hier alle Views, die wir verändern müssen
    private SeekBar redSeekbar;
    private EditText redEditText;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO initialisiere hier alle oben deklarierierten Views
        redSeekbar = findViewById(R.id.redSeekBar);
        redEditText = findViewById(R.id.redEditText);
        view = findViewById(R.id.view);

        redEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String redText = redEditText.getText().toString();
                try {
                    int tmp = Integer.valueOf(redText);
                    if (tmp >= 0 && tmp <= 255) {
                        red = tmp;
                        redSeekbar.setProgress(red);
                        view.setBackgroundColor(Color.argb(0xFF, red, green, blue));
                    } else {
                        redEditText.setText(String.valueOf(red));
                    }
                }catch (NumberFormatException e) {
                    redEditText.setText(String.valueOf(red));
                }
            }
        });

        redSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b) {
                    red = i;
                    redEditText.setText(String.valueOf(red));
                    view.setBackgroundColor(0xFF << 24 | red << 16 | green << 8 | blue);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
