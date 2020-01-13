package haw_hamburg.de.myintent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_KEY = "MainActivity.name.key";
    private static final String FILE_NAME = "messageFile.txt";
    private String message = "";
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button2);
        EditText editText = findViewById(R.id.editText);
        messageTextView = findViewById(R.id.messageTextView);

        button.setOnClickListener((View view) -> {
            String text = editText.getText().toString();
            message += text + "\n";
            Intent intent = new Intent(this, AnswerActivity.class);
            intent.putExtra(NAME_KEY, text);
            startActivity(intent);
        });

        try(FileReader fileReader = new FileReader(new File(this.getFilesDir().getPath(), FILE_NAME));
                BufferedReader reader = new BufferedReader(fileReader)) {


            String tmp = reader.readLine();

            while(tmp != null) {
                message += tmp + "\n";
                tmp = reader.readLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        messageTextView.setText(getFilesDir().getPath().toString() +"\n" + message);
    }

    @Override
    protected void onStop() {
        super.onStop();

        try(FileWriter fileWriter = new FileWriter(new File(getFilesDir().getPath(), FILE_NAME))) {
            fileWriter.write(message);
            fileWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
