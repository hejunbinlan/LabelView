package me.drakeet.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.normal_text);
        TextView labelView = (TextView) findViewById(R.id.lableview);
        textView.append(labelView.getText());
    }
}
